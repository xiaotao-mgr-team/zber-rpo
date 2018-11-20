package com.zb.zber.data.dao;

import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.data.model.ExpressType;
import org.springframework.stereotype.Repository;

/**
 * Created by cuixt on 2018/8/7.
 */
@Repository
public interface IExpressTypeDao {

    PaginationOrdersList<ExpressType> listExpressType(PaginationOrdersList<ExpressType> paramPaginationOrdersList, ExpressType paramExpressType);

    ExpressType queryExpressType(String paramString);
}
