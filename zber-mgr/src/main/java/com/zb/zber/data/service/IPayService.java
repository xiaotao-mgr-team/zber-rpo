package com.zb.zber.data.service;

import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.data.model.Pay;

/**
 * Created by cuixt on 2018/10/10.
 */
public interface IPayService {
    int add(Pay paramPay);

    int updatePay(String paramString);

    int deleteByDate(String dataTime);

    PaginationOrdersList<Pay> listPay(PaginationOrdersList<Pay> paramPaginationOrdersList, Pay paramPay);

    Pay queryPay(String paramString, boolean paramBoolean);
}
