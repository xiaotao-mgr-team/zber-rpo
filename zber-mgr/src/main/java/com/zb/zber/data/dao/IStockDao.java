package com.zb.zber.data.dao;

import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.data.model.Stock;

import java.util.List;

/**
 * Created by cuixt on 2018/8/7.
 */

public interface IStockDao {
    int insert(Stock paramStock);

    int updateById(Stock paramStock);

    int updateByProductId(Stock paramStock);

    int deleteById(String paramString);

    Stock selectById(String paramString);

    Stock selectByProductId(String paramString);

    List<Stock> selectList(Stock paramStock);

    PaginationOrdersList<Stock> listStock(PaginationOrdersList<Stock> paramPaginationOrdersList, Stock paramStock);

}
