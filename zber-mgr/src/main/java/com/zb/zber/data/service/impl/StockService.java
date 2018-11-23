package com.zb.zber.data.service.impl;

import com.whalin.MemCached.MemCachedClient;
import com.zb.zber.common.core.exception.BusinessException;
import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.data.dao.IProductDao;
import com.zb.zber.data.dao.IStockDao;
import com.zb.zber.data.dao.IStockRecordDao;
import com.zb.zber.data.model.Product;
import com.zb.zber.data.model.Stock;
import com.zb.zber.data.model.StockRecord;
import com.zb.zber.data.service.IStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by cuixt on 2018/8/7.
 */
@Service
public class StockService implements IStockService {

    @Autowired
    private IStockDao stockMapper;

    @Autowired
    private IProductDao productMapper;

    @Autowired
    private IStockRecordDao stockRecordMapper;

    @Autowired
    private MemCachedClient memCachedClient;

    public int insert(Stock record) throws BusinessException {
        Stock oldRecord = stockMapper.selectByProductId(record.getProductId());
        if (oldRecord != null) {
            throw new BusinessException("common.dir.not.exist.err");
        }
        if ((record != null) && (!StringUtils.isEmpty(record.getProductId())) && (StringUtils.isEmpty(record.getProductName()))) {
            Object productName = memCachedClient.get("PRODUCT_UNIT_NAME_" + record.getProductId());
            if (productName == null) {
                Product product = productMapper.selectById(record.getProductId());
                if (product != null) {
                    record.setProductName(product.getTitle());
                }
            } else {
                record.setProductName((String) productName);
            }
        }
        StockRecord stockRecord = new StockRecord();
        stockRecord.setProductId(record.getProductId());
        stockRecord.setProductName(record.getProductName());
        stockRecord.setType("管理员");
        stockRecord.setUserName("添加-库存");
        stockRecord.setNumber("+" + record.getTotalNumber());
        stockRecord.setLeftNumber(Integer.valueOf(record.getLeftNumber()));
        stockRecordMapper.insert(stockRecord);
        if (StringUtils.isEmpty(record.getStatus())) {
            record.setStatus("0");
        }
        return stockMapper.insert(record);
    }

    public int updateById(Stock record) {
        Stock oldRecord = stockMapper.selectById(record.getId());

        StockRecord stockRecord = new StockRecord();
        stockRecord.setProductId(oldRecord.getProductId());
        stockRecord.setProductName(oldRecord.getProductName());
        stockRecord.setType("管理员");
        stockRecord.setUserName("更新-库存");
        stockRecord.setNumber("+" + record.getTotalNumber());
        stockRecord.setLeftNumber(Integer.valueOf(record.getLeftNumber()));
        stockRecordMapper.insert(stockRecord);

        return stockMapper.updateById(record);
    }

    public int delete(String id) {
        Stock oldRecord = stockMapper.selectById(id);

        StockRecord stockRecord = new StockRecord();
        stockRecord.setProductId(oldRecord.getProductId());
        stockRecord.setProductName(oldRecord.getProductName());
        stockRecord.setType("管理员");
        stockRecord.setUserName("删除-库存");
        stockRecord.setNumber("0");
        stockRecord.setLeftNumber(Integer.valueOf(0));
        stockRecordMapper.insert(stockRecord);

        return stockMapper.deleteById(id);
    }

    public Stock selectById(String id) {
        Stock s = stockMapper.selectById(id);
        if (s != null) {
            s.format();
        }
        return s;
    }

    public List<Stock> selectList(Stock stock) {
        List<Stock> stockLists = stockMapper.selectList(stock);
        if ((stockLists != null) && (stockLists.size() > 0)) {
            for (int i = 0; i < stockLists.size(); i++) {
                ((Stock) stockLists.get(i)).format();
            }
        }
        return stockMapper.selectList(stock);
    }

    public PaginationOrdersList<Stock> listStock(PaginationOrdersList<Stock> page, Stock stock) {
        page = stockMapper.listStock(page, stock);
        if ((page != null) && (page.getDatas() != null) && (page.getDatas().size() > 0)) {
            List<Stock> stockLists = page.getDatas();
            if ((stockLists != null) && (stockLists.size() > 0)) {
                for (int i = 0; i < stockLists.size(); i++) {
                    ((Stock) stockLists.get(i)).format();
                }
            }
        }
        return page;
    }
}
