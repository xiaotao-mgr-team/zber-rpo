package com.zb.zber.data.service;

import com.zb.zber.common.core.exception.BusinessException;
import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.data.model.Express;

/**
 * Created by cuixt on 2018/10/10.
 */
public interface IExpressService {

    PaginationOrdersList<Express> listExpress(PaginationOrdersList<Express> paramPaginationOrdersList, Express paramExpress) throws BusinessException;

    int updateById(Express paramExpress);

    int addExpress(Express paramExpress) throws BusinessException;

    int deleteById(String paramString);

    Express selectById(String paramString);
}
