package com.zb.zber.data.service.impl;

import com.zb.zber.data.dao.IWebProductMainDao;
import com.zb.zber.data.model.WebProductMain;
import com.zb.zber.data.service.IWebProductMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by cuixt on 2018/9/28.
 */
@Service
public class WebProductMainService implements IWebProductMainService {

    @Autowired
    private IWebProductMainDao iWebProductMain;

    public int deleteById(String id){
        return iWebProductMain.deleteById(id);
    }

    public int insert(WebProductMain record){
        return iWebProductMain.insert(record);
    }

    public List<WebProductMain> selectByExample(WebProductMain example){
        return iWebProductMain.selectByExample(example);
    }

    public WebProductMain selectById(String id){
        return iWebProductMain.selectById(id);
    }

    public int updateById(WebProductMain record){
        return iWebProductMain.updateById(record);
    }
}
