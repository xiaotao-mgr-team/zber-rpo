package com.zb.zber.data.dao;

import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.data.model.ProductType;

import java.util.List;

/**
 * Created by cuixt on 2018/8/7.
 */

public interface IProductTypeDao {
    PaginationOrdersList<ProductType> pageListProductType(PaginationOrdersList<ProductType> paramPaginationOrdersList, ProductType paramProductType);

    List<ProductType> listProductType(ProductType productType);

    ProductType queryProductType(String paramString);
}
