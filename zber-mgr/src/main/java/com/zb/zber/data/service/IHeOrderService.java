package com.zb.zber.data.service;

import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.data.model.HeOrder;

import java.util.List;

/**
 * Created by cuixt on 2018/10/10.
 */
public interface IHeOrderService {

    int insert(HeOrder paramHeOrder);

    int update(HeOrder paramHeOrder);

    int deleteById(String paramString);

    List<HeOrder> selectByHeOrder(HeOrder paramHeOrder);

    HeOrder selectById(String paramString);

    PaginationOrdersList<HeOrder> selectList(PaginationOrdersList<HeOrder> paramPaginationOrdersList, HeOrder paramHeOrder);
}
