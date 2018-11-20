package com.zb.zber.data.dao;

import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.data.model.Express;

/**
 * Created by cuixt on 2018/8/7.
 */

public interface IExpressDao {

    PaginationOrdersList<Express> listExpress(PaginationOrdersList<Express> paramPaginationOrdersList, Express paramExpress);

    int updateById(Express paramExpress);

    int addExpress(Express paramExpress);

    int deleteById(String paramString);

    Express selectById(String paramString);
}
