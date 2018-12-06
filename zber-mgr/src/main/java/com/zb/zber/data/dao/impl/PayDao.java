package com.zb.zber.data.dao.impl;

import com.google.common.collect.Maps;
import com.zb.zber.common.core.persistence.db.dao.mybatis.SuperDao;
import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.data.dao.IPayDao;
import com.zb.zber.data.model.Pay;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Map;

/**
 * Created by cuixt on 2018/10/10.
 */
@Component
public class PayDao extends SuperDao implements IPayDao {
    @Override
    public int add(Pay pay) {
        pay.preInsert();
        return super.insert("com.zb.zber.data.model.Pay.insert", pay);
    }

    @Override
    public int deleteByDate(String dataTime) {
        Map<String, Object> maps = Maps.newHashMap();
        maps.put("checkDate", dataTime);
        return super.update("com.zb.zber.data.model.Pay.deleteByCheckDate", maps);
    }

    @Override
    public int updatePay(String checkTime) {
        Map<String, Object> maps = Maps.newHashMap();
        maps.put("checkDate", checkTime);
        return super.update("com.zb.zber.data.model.Pay.updateById", maps);
    }

    @Override
    public PaginationOrdersList<Pay> listPay(PaginationOrdersList<Pay> page, Pay pay) {
        return super.selectPage("com.zb.zber.data.model.Pay.listPay", pay, page);
    }

    @Override
    public Pay queryPay(Date createTime, boolean isDestion) {
        Map<String, Object> maps = Maps.newHashMap();
        maps.put("createTime", createTime);
        maps.put("isDestion", Boolean.valueOf(isDestion));
        return (Pay)super.selectOne("com.zb.zber.data.model.Pay.queryPay", maps);
    }
}
