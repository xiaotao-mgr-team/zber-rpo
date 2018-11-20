package com.zb.zber.data.dao.impl;

import com.zb.zber.common.core.persistence.db.dao.mybatis.SuperDao;
import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.data.dao.IExpressTypeDao;
import com.zb.zber.data.model.ExpressType;
import org.springframework.stereotype.Component;

/**
 * Created by cuixt on 2018/10/10.
 */
@Component
public class ExpressTypeDao extends SuperDao implements IExpressTypeDao {
    @Override
    public PaginationOrdersList<ExpressType> listExpressType(PaginationOrdersList<ExpressType> page, ExpressType expressType) {
        return super.selectPage("com.zb.zber.data.model.ExpressType.selectByCondition", expressType, page);
    }

    @Override
    public ExpressType queryExpressType(String id) {
        return super.selectOne("com.zb.zber.data.model.ExpressType.selectById", id);
    }
}
