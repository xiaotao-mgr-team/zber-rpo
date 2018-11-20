package com.zb.zber.data.service.impl;

import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.data.dao.IStockRecordDao;
import com.zb.zber.data.model.StockRecord;
import com.zb.zber.data.service.IStockRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by cuixt on 2018/8/7.
 */
@Service
public class StockRecordService implements IStockRecordService {

    @Autowired
    private IStockRecordDao stockRecordMapper;

    public int insert(StockRecord record)
    {
        return stockRecordMapper.insert(record);
    }

    public List<StockRecord> selectList(StockRecord stock)
    {
        return stockRecordMapper.selectList(stock);
    }

    public PaginationOrdersList<StockRecord> listStockDaoRecord(PaginationOrdersList<StockRecord> page, StockRecord stock)
    {
        page = stockRecordMapper.listStockDaoRecord(page, stock);
        if ((page != null) && (page.getDatas() != null) && (page.getDatas().size() > 0)) {
            for (int i = 0; i < page.getDatas().size(); i++) {
                ((StockRecord)page.getDatas().get(i)).format();
            }
        }
        return page;
    }
}
