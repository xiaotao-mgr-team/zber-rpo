package com.zb.zber.data.dao;
import com.zb.zber.data.model.WebProductInface;
import java.util.List;

public interface IWebProductInfaceDao {

    int deleteById(String id);

    int insert(WebProductInface record);

    List<WebProductInface> selectByExample(WebProductInface example);

    WebProductInface selectById(String id);

    int updateById(WebProductInface webProductInface) ;
}