package com.zb.zber.data.dao;

import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.data.model.Pay;

import java.util.Date;

/**
 * Created by cuixt on 2018/8/7.
 */

public interface IPayDao {
    int add(Pay paramPay);

    int deleteByDate(String dataTime);

    int updatePay(String id);

    PaginationOrdersList<Pay> listPay(PaginationOrdersList<Pay> paramPaginationOrdersList, Pay paramPay);

    Pay queryPay(Date paramDate, boolean paramBoolean);
}
