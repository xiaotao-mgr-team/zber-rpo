package com.zb.zber.data.dao.impl;

import com.zb.zber.common.core.persistence.db.dao.mybatis.SuperDao;
import com.zb.zber.data.dao.IIntordDao;
import com.zb.zber.data.model.Intord;
import org.springframework.stereotype.Component;

/**
 * Created by cuixt on 2018/11/5.
 */
@Component
public class IntordDao extends SuperDao implements IIntordDao {

    @Override
    public Intord selectById(String id) {
        return super.selectOne("com.zb.zber.data.model.Intord.selectById",id);
    }

    @Override
    public int updateById(Intord record) {
        record.preUpdate();
        return super.update("com.zb.zber.data.model.Intord.updateById",record);
    }

}
