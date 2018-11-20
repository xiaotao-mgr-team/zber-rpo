package com.zb.zber.data.dao;


import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.data.model.News;

/**
 * Created by cuixt on 2018/11/1.
 */
public interface INewsDao {

    public int deleteById(String id);

    public int insert(News record);

    public PaginationOrdersList<News> selectByNews(PaginationOrdersList<News> page, News record);

    public News selectById(String id);

    public int updateById(News record);
}
