package com.zb.zber.data.service.impl;

import com.zb.zber.common.core.exception.BusinessException;
import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.data.dao.IExpressDao;
import com.zb.zber.data.model.Express;
import com.zb.zber.data.service.IExpressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by cuixt on 2018/8/7.
 */
@Service
public class ExpressService implements IExpressService {
    @Autowired
    IExpressDao expressMapper;

    public PaginationOrdersList<Express> listExpress(PaginationOrdersList<Express> page, Express express) throws BusinessException {
        return expressMapper.listExpress(page, express);
    }

    public int updateById(Express express) {
        return expressMapper.updateById(express);
    }

    public int addExpress(Express express) throws BusinessException {
        return expressMapper.addExpress(express);
    }

    public int deleteById(String id) {
        return expressMapper.deleteById(id);
    }

    public Express selectById(String id) {
        return expressMapper.selectById(id);
    }
}
