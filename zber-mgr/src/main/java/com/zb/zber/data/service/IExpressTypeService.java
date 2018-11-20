package com.zb.zber.data.service;

import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.data.model.ExpressType;

/**
 * Created by cuixt on 2018/10/10.
 */
public interface IExpressTypeService {

    PaginationOrdersList<ExpressType> listExpressType(PaginationOrdersList<ExpressType> paramPaginationOrdersList, ExpressType paramExpressType);

    ExpressType queryExpressType(String paramString);
}
