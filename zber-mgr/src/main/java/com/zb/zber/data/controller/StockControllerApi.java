package com.zb.zber.data.controller;

import com.zb.zber.common.core.exception.BusinessException;
import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.common.utils.ParamCheckUtils;
import com.zb.zber.common.web.comp.ace.ResponseMessage;
import com.zb.zber.common.web.comp.ace.i18n.MessageResolver;
import com.zb.zber.data.model.Stock;
import com.zb.zber.data.service.IAdminService;
import com.zb.zber.data.service.IStockService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RequestMapping({"/bgr/stock"})
@Controller
public class StockControllerApi {

    @Autowired
    private IStockService stockService;
    @Autowired
    private IAdminService adminService;

    @RequestMapping(value={"/list-page"}, produces={"application/json"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    @ResponseBody
    public ResponseMessage listStockPage(Stock stock, PaginationOrdersList<Stock> page, HttpServletRequest request, HttpServletResponse response)
    {
        response.addHeader("Access-Control-Allow-Origin", "*");
        page = stockService.listStock(page, stock);
        return ResponseMessage.success(page);
    }

    @RequestMapping(value={"/list"}, produces={"application/json"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    @ResponseBody
    public ResponseMessage listStock(Stock stock, HttpServletRequest request, HttpServletResponse response)
    {
        response.addHeader("Access-Control-Allow-Origin", "*");
        List<Stock> stockList = stockService.selectList(stock);
        return ResponseMessage.success(stockList);
    }

    @RequestMapping(value={"/add"}, produces={"application/json"})
    @ResponseBody
    public ResponseMessage addStock(Stock stock, HttpServletRequest request, HttpServletResponse response) throws BusinessException {
        try
        {
            response.addHeader("Access-Control-Allow-Origin", "*");
            ParamCheckUtils.notAllNull(new Object[] { stock.getProductId() }, new String[] { "ProductId" });
            stockService.insert(stock);
            return ResponseMessage.success();
        }
        catch (BusinessException e)
        {
            return ResponseMessage.error((String)e.getValue(),
                    MessageResolver.getMessage(request, (String)e.getValue(), e.getPlaceholders()));
        }
    }

    @RequestMapping(value={"/update"}, produces={"application/json"})
    @ResponseBody
    public ResponseMessage updateStock(Stock stock, HttpServletRequest request, HttpServletResponse response)
    {
        response.addHeader("Access-Control-Allow-Origin", "*");
        if (StringUtils.isNotEmpty(stock.getId())) {
            stockService.updateById(stock);
        }
        return ResponseMessage.success();
    }

    @RequestMapping(value={"/detail"}, produces={"application/json"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    @ResponseBody
    public ResponseMessage getStock(String id, HttpServletRequest request, HttpServletResponse response)
    {
        response.addHeader("Access-Control-Allow-Origin", "*");
        if (StringUtils.isNotEmpty(id))
        {
            Stock stock = stockService.selectById(id);
            return ResponseMessage.success(stock);
        }
        return ResponseMessage.success();
    }

    @RequestMapping(value={"/delete"}, produces={"application/json"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    @ResponseBody
    public ResponseMessage deleteStock(String id, HttpServletRequest request, HttpServletResponse response)
    {
        response.addHeader("Access-Control-Allow-Origin", "*");
        if (StringUtils.isNotEmpty(id)) {
            stockService.delete(id);
        }
        return ResponseMessage.success();
    }
}
