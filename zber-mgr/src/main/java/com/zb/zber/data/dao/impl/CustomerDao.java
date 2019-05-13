package com.zb.zber.data.dao.impl;

import com.google.common.collect.Maps;
import com.zb.zber.common.core.exception.BusinessException;
import com.zb.zber.common.core.persistence.db.dao.mybatis.SuperDao;
import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.data.dao.ICustomerDao;
import com.zb.zber.data.model.Customer;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by cuixt on 2018/10/10.
 */
@Component
public class CustomerDao extends SuperDao implements ICustomerDao {
    @Override
    public PaginationOrdersList<Customer> listCustomer(PaginationOrdersList<Customer> page, Date startDate, Date endDate) {
        Map<String, Object> maps = Maps.newHashMap();
        maps.put("startDate", startDate);
        maps.put("endDate", endDate);
        return super.selectPage("com.zb.zber.data.model.Customer.listCustomer", maps, page);
    }

    @Override
    public int updateById(Customer customer) {
        customer.preUpdate();
        return super.update("com.zb.zber.data.model.Customer.updateById", customer);
    }

    @Override
    public int addCustomer(Customer customer) throws BusinessException {
        customer.preInsert();
        return super.insert("com.zb.zber.data.model.Customer.insert", customer);
    }

    @Override
    public int deleteById(String id) {
        return super.update("com.zb.zber.data.model.Customer.deleteById", id);
    }

    @Override
    public Customer selectById(String id) {
        return (Customer)super.selectOne("com.zb.zber.data.model.Customer.selectById", id);
    }

    @Override
    public int batchAdd(List<Customer> customers) {
        for(Customer customer:customers){
            customer.preInsert();
        }
        return super.insert("com.zb.zber.data.model.Customer.batchInsert", customers);
    }
}
