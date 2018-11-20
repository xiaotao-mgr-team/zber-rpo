package com.zb.zber.data.dao.impl;

import com.zb.zber.common.core.persistence.db.dao.mybatis.SuperDao;
import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.data.dao.IExpressDao;
import com.zb.zber.data.model.Express;
import org.springframework.stereotype.Component;

/**
 * Created by cuixt on 2018/10/10.
 */
@Component
public class ExpressDao extends SuperDao implements IExpressDao {
    @Override
    public PaginationOrdersList<Express> listExpress(PaginationOrdersList<Express> page, Express express) {
        return super.selectPage("com.zb.zber.data.model.Express.listExpress", express, page);
    }

    @Override
    public int updateById(Express express) {
        express.preUpdate();
        return super.update("com.zb.zber.data.model.Express.updateById", express);
    }

    @Override
    public int addExpress(Express express) {
        express.preInsert();
        return super.insert("com.zb.zber.data.model.Express.insert", express);
    }

    @Override
    public int deleteById(String id) {
        return super.update("com.zb.zber.data.model.Express.deleteById", id);
    }

    @Override
    public Express selectById(String id) {
        return super.selectOne("com.zb.zber.data.model.Express.selectById", id);
    }
}
