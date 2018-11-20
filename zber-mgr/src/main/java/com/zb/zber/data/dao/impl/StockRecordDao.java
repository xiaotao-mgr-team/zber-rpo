package com.zb.zber.data.dao.impl;

import com.zb.zber.common.core.persistence.db.dao.mybatis.SuperDao;
import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.data.dao.IStockRecordDao;
import com.zb.zber.data.model.StockRecord;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by cuixt on 2018/10/10.
 */
@Component
public class StockRecordDao extends SuperDao implements IStockRecordDao {
    @Override
    public int insert(StockRecord stockRecord) {
        stockRecord.preInsert();
        return super.insert("com.zb.zber.data.model.StockRecord.insert", stockRecord);
    }

    @Override
    public List<StockRecord> selectList(StockRecord stockRecord) {
        return super.selectList("com.zb.zber.data.model.StockRecord.selectList", stockRecord);
    }

    @Override
    public PaginationOrdersList<StockRecord> listStockDaoRecord(PaginationOrdersList<StockRecord> page, StockRecord stockRecord) {
        return super.selectPage("com.zb.zber.data.model.StockRecord.selectList", stockRecord, page);
    }
}
