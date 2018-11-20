package com.zb.zber.data.service;

import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.data.model.StockRecord;

import java.util.List;

/**
 * Created by cuixt on 2018/10/10.
 */
public interface IStockRecordService {
    int insert(StockRecord paramStockRecord);

    List<StockRecord> selectList(StockRecord paramStockRecord);

    PaginationOrdersList<StockRecord> listStockDaoRecord(PaginationOrdersList<StockRecord> paramPaginationOrdersList, StockRecord paramStockRecord);
}
