package com.zb.zber.data.service.impl;

import com.zb.zber.common.core.exception.BusinessException;
import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.data.dao.IProductDao;
import com.zb.zber.data.dao.IProductTypeDao;
import com.zb.zber.data.model.Product;
import com.zb.zber.data.model.ProductType;
import com.zb.zber.data.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * Created by cuixt on 2018/8/7.
 */
@Service
public class ProductService implements IProductService {

    @Autowired
    private IProductDao productMapper;

    @Autowired
    private IProductTypeDao productTypeMapper;

    @Autowired
    private IProductDao productDao;

    public PaginationOrdersList<Product> listProduct(PaginationOrdersList<Product> page, Product product) throws BusinessException {
        page = productDao.listProduct(page, product);
        if ((page == null) || (CollectionUtils.isEmpty(page.getDatas()))) {
            return page;
        }
        for (Product p : page.getDatas()) {
            p.format();
        }
        return page;
    }

    public int updateById(Product product) {
        return productMapper.updateById(product);
    }

    public Product addProduct(Product product) throws BusinessException {
        return productMapper.addProduct(product);
    }

    public int deleteById(String id) {
        return productMapper.deleteById(id);
    }

    public Product selectById(String id) {
        Product product = productMapper.selectById(id);
        if (product != null) {
            product.format();
        }
        return product;
    }

    public List<ProductType> listProductByType(ProductType productType) throws BusinessException {
        return productTypeMapper.listProductType( productType);
    }

    public PaginationOrdersList<ProductType> listProductType(PaginationOrdersList<ProductType> page, ProductType productType) throws BusinessException {
        return productTypeMapper.pageListProductType(page, productType);
    }

    public ProductType queryProductType(String id) {
        return productTypeMapper.queryProductType(id);
    }

}
