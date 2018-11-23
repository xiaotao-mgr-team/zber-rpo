package com.zb.zber.data.dao;

import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.data.model.HeOrder;

import java.util.Date;
import java.util.List;

/**
 * Created by cuixt on 2018/8/7.
 */

public interface IHeOrderDao {

    int insert(HeOrder paramHeOrder);

    int update(HeOrder paramHeOrder);

    int deleteById(String paramString);

    List<HeOrder> selectByHeOrder(HeOrder paramHeOrder);

    HeOrder selectById(String paramString);

    PaginationOrdersList<HeOrder> selectList(PaginationOrdersList<HeOrder> paramPaginationOrdersList, HeOrder paramHeOrder);

    PaginationOrdersList<HeOrder> listHeOrder(PaginationOrdersList<HeOrder> paramPaginationOrdersList, Date startTime, Date endTime);
}
