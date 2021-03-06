package com.zb.zber.data.service.impl;

import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.data.dao.IHeOrderDao;
import com.zb.zber.data.dao.IStockDao;
import com.zb.zber.data.model.HeOrder;
import com.zb.zber.data.service.IHeOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by cuixt on 2018/8/7.
 */
@Service
public class HeOrderService implements IHeOrderService {
    @Autowired
    IHeOrderDao heOrderMapper;

    @Autowired
    IStockDao stockMapper;

    public int insert(HeOrder record)
    {
        return heOrderMapper.insert(record);
    }

    public int update(HeOrder record)
    {
        return heOrderMapper.update(record);
    }

    public int deleteById(String id)
    {
        return heOrderMapper.deleteById(id);
    }

    public List<HeOrder> selectByHeOrder(HeOrder record)
    {
        return heOrderMapper.selectByHeOrder(record);
    }

    public HeOrder selectById(String id)
    {
        return heOrderMapper.selectById(id);
    }

    public PaginationOrdersList<HeOrder> selectList(PaginationOrdersList<HeOrder> page, HeOrder record)
    {
        return heOrderMapper.selectList(page, record);
    }

    @Override
    public PaginationOrdersList<HeOrder> listHeOrder(PaginationOrdersList<HeOrder> page, Date startTime, Date endTime) {
        return heOrderMapper.listHeOrder(page,startTime,endTime);
    }
}
