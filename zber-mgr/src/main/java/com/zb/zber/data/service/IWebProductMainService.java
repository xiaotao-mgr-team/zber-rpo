package com.zb.zber.data.service;

import com.zb.zber.data.model.WebProductMain;

import java.util.List;

/**
 * Created by cuixt on 2018/10/10.
 */
public interface IWebProductMainService {
    int deleteById(String id);

    int insert(WebProductMain record);

    List<WebProductMain> selectByExample(WebProductMain example);

    WebProductMain selectById(String id);

    int updateById(WebProductMain record);
}
