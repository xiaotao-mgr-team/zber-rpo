package com.zb.zber.data.dao;


import com.zb.zber.data.model.WebProduct;

import java.util.List;

public interface IWebProductDao {

    int deleteById(String id);

    int insert(WebProduct record);

    List<WebProduct> selectByExample(WebProduct example);

    WebProduct selectById(String id);

    int updateById(WebProduct example);
}