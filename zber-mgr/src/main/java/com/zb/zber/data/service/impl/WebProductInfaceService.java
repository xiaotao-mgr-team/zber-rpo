package com.zb.zber.data.service.impl;

import com.zb.zber.data.dao.IWebProductInfaceDao;
import com.zb.zber.data.model.WebProductInface;
import com.zb.zber.data.service.IWebProductInfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by cuixt on 2018/9/28.
 */
@Service
public class WebProductInfaceService implements IWebProductInfaceService {

    @Autowired
    private IWebProductInfaceDao iWebProductInface;

    public int deleteById(String id){
        return iWebProductInface.deleteById(id);
    }

    public int insert(WebProductInface record){
        return iWebProductInface.insert(record);
    }

    public List<WebProductInface> selectByExample(WebProductInface example){
        return iWebProductInface.selectByExample(example);
    }

    public WebProductInface selectById(String id){
        return iWebProductInface.selectById(id);
    }

    public int updateById(WebProductInface webProductInface) {
        return iWebProductInface.updateById(webProductInface);
    }
}
