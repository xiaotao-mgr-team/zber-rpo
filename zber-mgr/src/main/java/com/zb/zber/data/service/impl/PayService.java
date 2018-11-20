package com.zb.zber.data.service.impl;

import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.data.dao.IPayDao;
import com.zb.zber.data.model.Pay;
import com.zb.zber.data.service.IPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by cuixt on 2018/8/7.
 */
@Service
public class PayService implements IPayService {

    @Autowired
    private IPayDao payMapper;

    public int add(Pay pay)
    {
        return payMapper.add(pay);
    }

    public int updatePay(String createTime)
    {
        try
        {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            return payMapper.updatePay(format.parse(createTime));
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
        return 11;
    }

    public PaginationOrdersList<Pay> listPay(PaginationOrdersList<Pay> page, Pay pay)
    {
        return payMapper.listPay(page, pay);
    }

    public Pay queryPay(String createTime, boolean isDestion)
    {
        try
        {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            return payMapper.queryPay(format.parse(createTime), isDestion);
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
