package com.zb.zber.data.dao.impl;

import com.zb.zber.common.core.persistence.db.dao.mybatis.SuperDao;
import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.data.dao.IProductTypeDao;
import com.zb.zber.data.model.ProductType;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by cuixt on 2018/10/10.
 */
@Component
public class ProductTypeDao extends SuperDao implements IProductTypeDao {

    @Override
    public PaginationOrdersList<ProductType> pageListProductType(PaginationOrdersList<ProductType> page, ProductType productType) {
        return super.selectPage("com.zb.zber.data.model.ProductType.selectByCondition", productType, page);
    }

    @Override
    public List<ProductType> listProductType(ProductType productType) {
        return super.selectList("com.zb.zber.data.model.ProductType.selectByCondition", productType);
    }

    @Override
    public ProductType queryProductType(String id) {
        return super.selectOne("com.zb.zber.data.model.ProductType.selectById", id);
    }
}
