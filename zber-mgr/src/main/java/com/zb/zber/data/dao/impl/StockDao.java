package com.zb.zber.data.dao.impl;

import com.zb.zber.common.core.persistence.db.dao.mybatis.SuperDao;
import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.data.dao.IStockDao;
import com.zb.zber.data.model.Stock;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by cuixt on 2018/10/10.
 */
@Component
public class StockDao extends SuperDao implements IStockDao {
    @Override
    public int insert(Stock record) {
        record.preInsert();
        return super.insert("com.zb.zber.data.model.Stock.insert", record);
    }

    @Override
    public int updateById(Stock record) {
        record.preUpdate();
        return super.update("com.zb.zber.data.model.Stock.updateById", record);
    }

    @Override
    public int updateByProductId(Stock stock) {
        stock.preUpdate();
        return super.update("com.zb.zber.data.model.Stock.updateByProductId", stock);
    }

    @Override
    public int deleteById(String id) {
        return super.update("com.zb.zber.data.model.Stock.deleteById", id);
    }

    @Override
    public Stock selectById(String id) {
        return super.selectOne("com.zb.zber.data.model.Stock.selectById", id);
    }

    @Override
    public Stock selectByProductId(String productId) {
        return (Stock)super.selectOne("com.zb.zber.data.model.Stock.selectByProductId", productId);
    }

    @Override
    public List<Stock> selectList(Stock stock) {
        return super.selectList("com.zb.zber.data.model.Stock.selectList", stock);
    }

    @Override
    public PaginationOrdersList<Stock> listStock(PaginationOrdersList<Stock> page, Stock stock) {
        return super.selectPage("com.zb.zber.data.model.Stock.selectList", stock, page);
    }
}
