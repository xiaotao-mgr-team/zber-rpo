package com.zb.zber.data.service.impl;

import com.whalin.MemCached.MemCachedClient;
import com.zb.zber.common.core.exception.BusinessException;
import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.data.dao.ICustomerDao;
import com.zb.zber.data.dao.IProductDao;
import com.zb.zber.data.dao.IStockDao;
import com.zb.zber.data.dao.IStockRecordDao;
import com.zb.zber.data.model.Customer;
import com.zb.zber.data.model.Product;
import com.zb.zber.data.model.Stock;
import com.zb.zber.data.model.StockRecord;
import com.zb.zber.data.service.ICustomerSerive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;

/**
 * Created by cuixt on 2018/8/7.
 */
@Service
public class CustomerSerive implements ICustomerSerive {

    @Autowired
    private ICustomerDao customerMapper;

    @Autowired
    private IStockRecordDao stockRecordMapper;

    @Autowired
    private IStockDao stockMapper;

    @Autowired
    private IProductDao productMapper;

    @Autowired
    private MemCachedClient memCachedClient;

    public PaginationOrdersList<Customer> listCustomer(PaginationOrdersList<Customer> page, Date startDate, Date endDate) throws BusinessException {
        page = customerMapper.listCustomer(page, startDate, endDate);
        if ((page != null) && (page.getDatas().size() > 0)) {
            for (Customer customer : page.getDatas()) {
                customer.format();
            }
        }
        return page;
    }

    public int updateById(Customer customer) {
        if (customer.getNumber() != null) {
            StockRecord stockRecord = new StockRecord();

            Customer oldCustomer = customerMapper.selectById(customer.getId());
            if (!StringUtils.isEmpty(oldCustomer.getProduct())) {
//                Object productName = memCachedClient.get("PRODUCT_UNIT_NAME_" + oldCustomer.getProduct());
                String productName = "";
                if (productName == null) {
                    Product product = productMapper.selectById(oldCustomer.getProduct());
                    if (product != null) {
                        stockRecord.setProductName(product.getTitle());
                    }
                } else {
                    stockRecord.setProductName((String) productName);
                }
            }
            stockRecord.setProductId(oldCustomer.getProduct());
            stockRecord.setType("-");
            stockRecord.setNumber("-" + oldCustomer.getNumber());
            stockRecord.setRemark("订单更新");
            stockRecordMapper.insert(stockRecord);

            Stock stock = stockMapper.selectByProductId(oldCustomer.getProduct());
            stock.setLeftNumber(stock.getLeftNumber() - customer.getNumber().intValue() + oldCustomer.getNumber().intValue());
            stockMapper.updateByProductId(stock);
        }
        return customerMapper.updateById(customer);
    }

    public int addCustomer(Customer customer) throws BusinessException {
        return customerMapper.addCustomer(customer);
    }

    public int deleteById(String id) {
//        StockRecord stockRecord = new StockRecord();
//
//        Customer oldCustomer = customerMapper.selectById(id);
//        if (!StringUtils.isEmpty(oldCustomer.getProduct())) {
//            Object productName = memCachedClient.get("PRODUCT_UNIT_NAME_" + oldCustomer.getProduct());
//            if (productName == null) {
//                Product product = productMapper.selectById(oldCustomer.getProduct());
//                if (product != null) {
//                    stockRecord.setProductName(product.getTitle());
//                }
//            } else {
//                stockRecord.setProductName((String) productName);
//            }
//        }
//        stockRecord.setProductId(oldCustomer.getProduct());
//        stockRecord.setType("-");
//        stockRecord.setNumber("+" + oldCustomer.getNumber());
//        stockRecord.setRemark("订单删除");
//        stockRecordMapper.insert(stockRecord);
//
//        Stock stock = stockMapper.selectByProductId(oldCustomer.getProduct());
//
//        stock.setLeftNumber(stock.getLeftNumber() + oldCustomer.getNumber().intValue());
//        stockMapper.updateByProductId(stock);

        return customerMapper.deleteById(id);
    }

    public Customer selectById(String id) {
        Customer cus = customerMapper.selectById(id);
        cus.format();
        return cus;
    }
}
