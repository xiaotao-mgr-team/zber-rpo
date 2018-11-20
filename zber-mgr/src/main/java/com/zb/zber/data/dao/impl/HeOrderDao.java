package com.zb.zber.data.dao.impl;

import com.zb.zber.common.core.persistence.db.dao.mybatis.SuperDao;
import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.data.dao.IHeOrderDao;
import com.zb.zber.data.model.HeOrder;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by cuixt on 2018/10/10.
 */
@Component
public class HeOrderDao extends SuperDao implements IHeOrderDao {
    @Override
    public int insert(HeOrder record) {
        record.preInsert();
        return super.insert("com.zb.zber.data.model.HeOrder.insert", record);
    }

    @Override
    public int update(HeOrder record) {
        record.preUpdate();
        return super.update("com.zb.zber.data.model.HeOrder.update", record);
    }

    @Override
    public int deleteById(String id) {
        return super.update("com.zb.zber.data.model.HeOrder.deleteById", id);
    }

    @Override
    public List<HeOrder> selectByHeOrder(HeOrder record) {
        return super.selectList("com.zb.zber.data.model.HeOrder.selectByHeOrder", record);
    }

    @Override
    public HeOrder selectById(String id) {
        return super.selectOne("com.zb.zber.data.model.HeOrder.selectById", id);
    }

    @Override
    public PaginationOrdersList<HeOrder> selectList(PaginationOrdersList<HeOrder> page, HeOrder record) {
        return super.selectPage("com.zb.zber.data.model.HeOrder.selectByHeOrder", record, page);
    }
}
