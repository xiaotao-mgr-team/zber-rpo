package com.zb.zber.data.dao.impl;

import com.zb.zber.common.core.exception.BusinessException;
import com.zb.zber.common.core.persistence.db.dao.mybatis.SuperDao;
import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.data.dao.IProductDao;
import com.zb.zber.data.model.Product;
import com.zb.zber.data.model.ProductType;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by cuixt on 2018/9/17.
 */
@Component
public class ProductDao extends SuperDao implements IProductDao {
    @Override
    public PaginationOrdersList<Product> listProduct(PaginationOrdersList<Product> page, Product product) {
        return super.selectPage("com.zb.zber.data.model.Product.listProduct", product, page);
    }

    @Override
    public PaginationOrdersList<Product> listAllProduct(PaginationOrdersList<Product> page, Product product) {
        return super.selectPage("com.zb.zber.data.model.Product.listAllProduct", product, page);
    }

    @Override
    public int updateById(Product product) {
        return super.update("com.zb.zber.data.model.Product.updateById", product);
    }

    @Override
    public Product addProduct(Product product) throws BusinessException {
        product.preInsert();
        super.insert("com.zb.zber.data.model.Product.add", product);
        return product;
    }

    @Override
    public int deleteById(String id) {
        return super.update("com.zb.zber.data.model.Product.deleteById", id);
    }

    @Override
    public Product selectById(String id) {
        return (Product)super.selectOne("com.zb.zber.data.model.Product.selectById", id);
    }

    @Override
    public List<ProductType> getProductType(ProductType paramProductType) {
        return null;
    }

    @Override
    public Product selectByName(String title) {
        return (Product)super.selectOne("com.zb.zber.data.model.Product.selectByName", title);
    }
}
