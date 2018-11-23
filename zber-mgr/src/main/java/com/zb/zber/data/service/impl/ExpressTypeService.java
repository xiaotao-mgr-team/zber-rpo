package com.zb.zber.data.service.impl;

import com.whalin.MemCached.MemCachedClient;
import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.data.dao.IExpressTypeDao;
import com.zb.zber.data.model.ExpressType;
import com.zb.zber.data.service.IExpressTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by cuixt on 2018/8/7.
 */
@Service
public class ExpressTypeService implements IExpressTypeService {

    @Autowired
    private MemCachedClient memCachedClient;

    @Autowired
    private IExpressTypeDao expressTypeMapper;

    public PaginationOrdersList<ExpressType> listExpressType(PaginationOrdersList<ExpressType> page, ExpressType expressType) {
        return expressTypeMapper.listExpressType(page, expressType);
    }

    public ExpressType queryExpressType(String id) { PaginationOrdersList<ExpressType> page = new PaginationOrdersList();
        if ((page != null) && (page.getDatas() != null) && (page.getDatas().size() > 0)) {
            for (ExpressType pt : page.getDatas()) {
                memCachedClient.set("EXPRESS_" + pt.getId(), pt.getName(), 86400);
            }
        }
        return expressTypeMapper.queryExpressType(id);
    }
}
