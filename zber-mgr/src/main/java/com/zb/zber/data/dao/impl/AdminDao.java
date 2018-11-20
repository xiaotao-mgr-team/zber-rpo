package com.zb.zber.data.dao.impl;

import com.zb.zber.common.core.persistence.db.dao.mybatis.SuperDao;
import com.zb.zber.data.dao.IAdminDao;
import com.zb.zber.data.model.Admin;
import org.springframework.stereotype.Component;

/**
 * Created by cuixt on 2018/10/10.
 */
@Component
public class AdminDao extends SuperDao implements IAdminDao {
    @Override
    public Admin selectById(String id) {
        return super.selectOne("com.zb.zber.data.model.Admin.selectById",id );
    }

    @Override
    public Admin getUserByName(String name) {
        return super.selectOne("com.zb.zber.data.model.Admin.getUserByName", name );
    }

    @Override
    public int updateById(Admin record) {
        record.preUpdate();
        return super.update("com.zb.zber.data.model.Admin.updateById",record);
    }
}
