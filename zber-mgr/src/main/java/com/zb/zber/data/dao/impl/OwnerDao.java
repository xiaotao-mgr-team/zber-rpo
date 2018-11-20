package com.zb.zber.data.dao.impl;

import com.zb.zber.common.core.persistence.db.dao.mybatis.SuperDao;
import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.data.dao.IOwnerDao;
import com.zb.zber.data.model.Owner;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by cuixt on 2018/10/10.
 */
@Component
public class OwnerDao extends SuperDao implements IOwnerDao {
    @Override
    public int insert(Owner record) {
        record.preInsert();
        return super.insert("com.zb.zber.data.model.Owner.insert", record);
    }

    @Override
    public int updateById(Owner record) {
        record.preUpdate();
        return super.update("com.zb.zber.data.model.Owner.updateById", record);
    }

    @Override
    public int deleteById(String id) {
        return super.update("com.zb.zber.data.model.Owner.deleteById", id);
    }

    @Override
    public Owner selectById(String id) {
        return (Owner)super.selectOne("com.zb.zber.data.model.Owner.selectById", id);
    }

    @Override
    public List<Owner> selectList(Owner record) {
        return super.selectList("com.zb.zber.data.model.Owner.selectList", record);
    }

    @Override
    public PaginationOrdersList<Owner> listOwner(PaginationOrdersList<Owner> page, Owner owner) {
        return super.selectPage("com.zb.zber.data.model.Owner.selectList", owner, page);
    }
}
