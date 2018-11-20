package com.zb.zber.data.service;

import com.zb.zber.common.core.exception.BusinessException;
import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.data.model.Customer;

import java.util.Date;

/**
 * Created by cuixt on 2018/10/10.
 */
public interface ICustomerSerive {

    PaginationOrdersList<Customer> listCustomer(PaginationOrdersList<Customer> paramPaginationOrdersList, Date startTime, Date endTime) throws BusinessException;

    int updateById(Customer paramCustomer);

    int addCustomer(Customer paramCustomer) throws BusinessException;

    int deleteById(String paramString);

    Customer selectById(String paramString);
}
