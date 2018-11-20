package com.zb.zber.data.service.impl;

import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.data.dao.INewsDao;
import com.zb.zber.data.model.News;
import com.zb.zber.data.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by cuixt on 2018/11/1.
 */
@Service
public class NewsService implements INewsService {

    @Autowired
    private INewsDao newsDao;

    @Override
    public int deleteById(String id) {
        return newsDao.deleteById(id);
    }

    @Override
    public int insert(News record) {
        return newsDao.insert(record);
    }

    @Override
    public PaginationOrdersList<News> selectByNews(PaginationOrdersList<News> page, News record) {
        return newsDao.selectByNews(page,record);
    }

    @Override
    public News selectById(String id) {
        return newsDao.selectById(id);
    }

    @Override
    public int updateById(News record) {
        return newsDao.updateById(record);
    }
}
