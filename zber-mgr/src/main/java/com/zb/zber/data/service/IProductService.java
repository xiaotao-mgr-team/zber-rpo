package com.zb.zber.data.service;

import com.zb.zber.common.core.exception.BusinessException;
import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.data.model.Product;
import com.zb.zber.data.model.ProductType;

import java.util.List;

/**
 * Created by cuixt on 2018/10/10.
 */
public interface IProductService {
    PaginationOrdersList<Product> listProduct(PaginationOrdersList<Product> paramPaginationOrdersList, Product paramProduct) throws BusinessException;

    int updateById(Product paramProduct);

    Product addProduct(Product paramProduct) throws BusinessException;

    int deleteById(String paramString);

    Product selectById(String paramString);

    List<ProductType> listProductByType(ProductType paramProductType) throws BusinessException;

    PaginationOrdersList<ProductType> listProductType(PaginationOrdersList<ProductType> paramPaginationOrdersList, ProductType paramProductType) throws BusinessException;

    ProductType queryProductType(String paramString);
}
