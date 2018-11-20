package com.zb.zber.data.service;

import com.zb.zber.data.model.WebProduct;

import java.util.List;

/**
 * Created by cuixt on 2018/10/10.
 */
public interface IWebProjectService {
    int deleteById(String id);

    int insert(WebProduct record);

    List<WebProduct> selectByExample(WebProduct example);

    WebProduct selectById(String id);

    int updateById(WebProduct entity);
}
