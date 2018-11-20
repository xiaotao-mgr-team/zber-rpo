package com.zb.zber.data.dao;

import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.data.model.StockRecord;

import java.util.List;

/**
 * Created by cuixt on 2018/8/7.
 */


public interface IStockRecordDao {
    int insert(StockRecord paramStockRecord);

    List<StockRecord> selectList(StockRecord paramStockRecord);

    PaginationOrdersList<StockRecord> listStockDaoRecord(PaginationOrdersList<StockRecord> paramPaginationOrdersList, StockRecord paramStockRecord);

}
