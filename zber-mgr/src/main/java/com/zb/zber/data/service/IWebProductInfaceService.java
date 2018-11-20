package com.zb.zber.data.service;

import com.zb.zber.data.model.WebProductInface;

import java.util.List;

/**
 * Created by cuixt on 2018/10/10.
 */
public interface IWebProductInfaceService {
    int deleteById(String id);

    int insert(WebProductInface record);

    List<WebProductInface> selectByExample(WebProductInface example);

    WebProductInface selectById(String id);

    int updateById(WebProductInface webProductInface) ;
}
