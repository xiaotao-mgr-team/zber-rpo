package com.zb.zber.data.dao.impl;

import com.zb.zber.common.core.persistence.db.dao.mybatis.SuperDao;
import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.data.dao.INewsDao;
import com.zb.zber.data.model.News;
import org.springframework.stereotype.Component;

/**
 * Created by cuixt on 2018/11/1.
 */
@Component
public class NewsDao extends SuperDao implements INewsDao {

    @Override
    public int deleteById(String id) {
        return super.update("com.zb.zber.data.model.News.deleteById",id);
    }

    @Override
    public int insert(News record) {
        record.preInsert();
        return super.insert("com.zb.zber.data.model.News.insert",record);
    }

    @Override
    public PaginationOrdersList<News> selectByNews(PaginationOrdersList<News> page, News record) {
        return super.selectPage("com.zb.zber.data.model.News.selectList",record,page);
    }

    @Override
    public News selectById(String id) {
        return super.selectOne("com.zb.zber.data.model.News.selectById",id);
    }

    @Override
    public int updateById(News record) {
        record.preUpdate();
        return super.update("com.zb.zber.data.model.News.updateById",record);
    }
}
