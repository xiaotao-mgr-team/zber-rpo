package com.zb.zber.data.dao;

import com.zb.zber.common.core.exception.BusinessException;
import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.data.model.Product;
import com.zb.zber.data.model.ProductType;

import java.util.List;

/**
 * Created by cuixt on 2018/9/17.
 */
public interface IProductDao {

    PaginationOrdersList<Product> listProduct(PaginationOrdersList<Product> paramPaginationOrdersList, Product paramProduct);

    int updateById(Product paramProduct);

    Product addProduct(Product paramProduct) throws BusinessException;

    int deleteById(String paramString);

    Product selectById(String paramString);

    List<ProductType> getProductType(ProductType paramProductType);

}
