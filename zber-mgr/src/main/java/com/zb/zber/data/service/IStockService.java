package com.zb.zber.data.service;

import com.zb.zber.common.core.exception.BusinessException;
import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.data.model.Stock;

import java.util.List;

/**
 * Created by cuixt on 2018/10/10.
 */
public interface IStockService {
    public abstract int insert(Stock paramStock) throws BusinessException;

    public abstract int updateById(Stock paramStock);

    public abstract int delete(String paramString);

    public abstract Stock selectById(String paramString);

    public abstract List<Stock> selectList(Stock paramStock);

    public abstract PaginationOrdersList<Stock> listStock(PaginationOrdersList<Stock> paramPaginationOrdersList, Stock paramStock);
}
