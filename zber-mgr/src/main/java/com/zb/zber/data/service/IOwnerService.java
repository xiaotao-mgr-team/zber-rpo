package com.zb.zber.data.service;

import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.data.model.Owner;

import java.util.List;

/**
 * Created by cuixt on 2018/10/10.
 */
public interface IOwnerService {
    int insert(Owner paramOwner);

    int updateById(Owner paramOwner);

    int deleteById(String paramString);

    Owner selectById(String paramString);

    List<Owner> selectList(Owner paramOwner);

    PaginationOrdersList<Owner> listOwner(PaginationOrdersList<Owner> paramPaginationOrdersList, Owner paramOwner);
}
