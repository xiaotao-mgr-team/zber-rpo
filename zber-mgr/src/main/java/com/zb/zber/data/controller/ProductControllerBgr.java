package com.zb.zber.data.controller;

import com.google.common.collect.Lists;
import com.whalin.MemCached.MemCachedClient;
import com.zb.zber.common.core.exception.BusinessException;
import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.common.utils.ParamCheckUtils;
import com.zb.zber.common.web.comp.ace.ResponseMessage;
import com.zb.zber.common.web.comp.ace.i18n.MessageResolver;
import com.zb.zber.data.common.CommonConstant;
import com.zb.zber.data.enums.FileDomainEnum;
import com.zb.zber.data.handler.UrlHandler;
import com.zb.zber.data.model.Product;
import com.zb.zber.data.model.ProductType;
import com.zb.zber.data.service.IProductService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


@RequestMapping({"/bgr/product"})
@Controller
public class ProductControllerBgr {
    private static final Logger logger = LoggerFactory.getLogger(ProductControllerBgr.class);
    @Autowired
    private IProductService productService;

    @Autowired
    private MemCachedClient memCachedClient;

    @RequestMapping(value={"/type/list"}, produces={"application/json"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    @ResponseBody
    public ResponseMessage listProductType(ProductType productType, PaginationOrdersList<ProductType> page, HttpServletRequest request, HttpServletResponse response)
    {
        try
        {
            response.addHeader("Access-Control-Allow-Origin", "*");
            page = productService.listProductType(page, productType);

            return ResponseMessage.success(page);
        }
        catch (BusinessException e)
        {
            logger.warn("api.listProductType. error!", e);
            return ResponseMessage.error((String)e.getValue(), MessageResolver.getMessage(request, (String)e.getValue(), e.getPlaceholders()));
        }
    }

    @RequestMapping(value={"/add"}, produces={"application/json"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
    @ResponseBody
    public ResponseMessage addProduct(Product product, HttpServletRequest request, HttpServletResponse response)
    {
        try
        {
            ParamCheckUtils.notAllNull(new Object[] { product.getTypeId(), product.getIntroduce(), product.getPrice(), product.getTitle() },
                    new String[] { "TypeId", "Introduce", "Price", "Title" });
            response.addHeader("Access-Control-Allow-Origin", "*");
            Product pt = this.productService.addProduct(product);
            memCachedClient.set("PRODUCT_UNIT_NAME_" + pt.getId(), pt.getTitle());
            memCachedClient.set("PRODUCT_UNIT_PRICE_" + pt.getId(), pt.getPrice());
            if (StringUtils.isNotEmpty(product.getImg()))
            {
                String[] imgs = product.getImg().split(",");
                for (String m : imgs) {
                    UrlHandler.copyFile(m, FileDomainEnum.ZBER_PRODUCT.getCode(), CommonConstant.UploadFileType.IMAGE.getCode());
                }
            }
            return ResponseMessage.success();
        }
        catch (BusinessException e)
        {
            logger.warn("api.add. error!", e);
            return ResponseMessage.error((String)e.getValue(),
                    MessageResolver.getMessage(request, (String)e.getValue(), e.getPlaceholders()));
        }
    }

    @RequestMapping(value={"/update"}, produces={"application/json"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
    @ResponseBody
    public ResponseMessage updateProduct(Product product, HttpServletRequest request, HttpServletResponse response)
    {
        try
        {
            response.addHeader("Access-Control-Allow-Origin", "*");
            ParamCheckUtils.notAllNull(new Object[] { product.getId(), product.getTypeId(), product.getIntroduce(), product.getPrice(), product.getTitle() },
                    new String[] { "Id", "TypeId", "Introduce", "Price", "Title" });

            this.productService.updateById(product);
            memCachedClient.set(product.getId(), product.getTitle());
            memCachedClient.set("PRODUCT_UNIT_PRICE_" + product.getId(), product.getPrice());
//            if (StringUtils.isNotEmpty(product.getImg())) {
//                UrlHandler.copyFile(product.getImg(), FileDomainEnum.ZBER_PRODUCT.getCode(), CommonConstant.UploadFileType.IMAGE.getCode());
//            }
            return ResponseMessage.success();
        }
        catch (BusinessException e)
        {
            logger.warn("api.update.login. error!", e);
            return ResponseMessage.error((String)e.getValue(), MessageResolver.getMessage(request, (String)e.getValue(), e.getPlaceholders()));
        }
    }

    @RequestMapping(value={"/list"}, produces={"application/json"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    @ResponseBody
    public ResponseMessage listProduct(PaginationOrdersList<Product> page, Product product, HttpServletRequest request, HttpServletResponse response)
    {
        try
        {
            response.addHeader("Access-Control-Allow-Origin", "*");
            page = this.productService.listProduct(page, product);
            if ((page != null) && (page.getDatas() != null) && (page.getDatas().size() > 0)) {
                for (Product pt : page.getDatas()) {
                    memCachedClient.set(pt.getId(), pt.getTitle());
                }
            }
            return ResponseMessage.success(page);
        }
        catch (BusinessException e)
        {
            logger.warn("api.list. error!", e);
            return ResponseMessage.error((String)e.getValue(), MessageResolver.getMessage(request, (String)e.getValue(), e.getPlaceholders()));
        }
    }

    @RequestMapping(value={"/hb/list"}, produces={"application/json"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    @ResponseBody
    public ResponseMessage hbList(HttpServletRequest request, HttpServletResponse response)
    {
        response.addHeader("Access-Control-Allow-Origin", "*");
        List<String> hbList = Lists.newArrayList();
        String prox = FileDomainEnum.ZBER_HB_PRODUCT.getCode();
        hbList.add(UrlHandler.getImageUrlWithOutSuffix("first.jpg", prox));
        hbList.add(UrlHandler.getImageUrlWithOutSuffix("second.jpg", prox));
        hbList.add(UrlHandler.getImageUrlWithOutSuffix("third.jpg", prox));
        hbList.add(UrlHandler.getImageUrlWithOutSuffix("forth.jpg", prox));
        return ResponseMessage.success(hbList);
    }

    @RequestMapping(value={"/detail/{id}"}, produces={"application/json"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    @ResponseBody
    public ResponseMessage getProductDetail(@PathVariable String id, HttpServletRequest request, HttpServletResponse response)
    {
        try
        {
            response.addHeader("Access-Control-Allow-Origin", "*");
            ParamCheckUtils.notAllNull(new Object[] { id }, new String[] { "id" });
            Product product = this.productService.selectById(id);

            return ResponseMessage.success(product);
        }
        catch (BusinessException e)
        {
            logger.warn("api.detail.login. error!", e);
            return ResponseMessage.error((String)e.getValue(),
                    MessageResolver.getMessage(request, (String)e.getValue(), e.getPlaceholders()));
        }
    }

    @RequestMapping(value={"/delete/{id}"}, produces={"application/json"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    @ResponseBody
    public ResponseMessage deleteProduct(@PathVariable String id, HttpServletRequest request, HttpServletResponse response)
    {
        try
        {
            ParamCheckUtils.notAllNull(new Object[] { id }, new String[] { "id" });
            response.addHeader("Access-Control-Allow-Origin", "*");
            this.productService.deleteById(id);

            return ResponseMessage.success();
        }
        catch (BusinessException e)
        {
            logger.warn("api.delete. error!", e);
            return ResponseMessage.error((String)e.getValue(),
                    MessageResolver.getMessage(request, (String)e.getValue(), e.getPlaceholders()));
        }
    }
}
