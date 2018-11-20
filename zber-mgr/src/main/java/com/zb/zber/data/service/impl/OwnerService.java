package com.zb.zber.data.service.impl;

import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.data.dao.IOwnerDao;
import com.zb.zber.data.model.Owner;
import com.zb.zber.data.service.IOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by cuixt on 2018/8/7.
 */
@Service
public class OwnerService implements IOwnerService {

    @Autowired
    private IOwnerDao ownerMapper;

    public int insert(Owner record)
    {
        return ownerMapper.insert(record);
    }

    public int updateById(Owner record)
    {
        return ownerMapper.updateById(record);
    }

    public int deleteById(String id)
    {
        return ownerMapper.deleteById(id);
    }

    public Owner selectById(String id)
    {
        return ownerMapper.selectById(id);
    }

    public List<Owner> selectList(Owner owner)
    {
        return ownerMapper.selectList(owner);
    }

    public PaginationOrdersList<Owner> listOwner(PaginationOrdersList<Owner> page, Owner owner)
    {
        return ownerMapper.listOwner(page, owner);
    }
}
