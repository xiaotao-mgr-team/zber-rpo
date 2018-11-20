package com.zb.zber.data.dao;

import com.zb.zber.data.model.WebProductMain;

import java.util.List;

public interface IWebProductMainDao {

    int deleteById(String id);

    int insert(WebProductMain record);

    List<WebProductMain> selectByExample(WebProductMain example);

    WebProductMain selectById(String id);

    int updateById(WebProductMain example);
}