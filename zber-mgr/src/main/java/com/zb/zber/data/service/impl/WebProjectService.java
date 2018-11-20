package com.zb.zber.data.service.impl;

import com.zb.zber.data.dao.IWebProductDao;
import com.zb.zber.data.model.WebProduct;
import com.zb.zber.data.service.IWebProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by cuixt on 2018/9/28.
 */

@Service
public class WebProjectService implements IWebProjectService {

    @Autowired
    private IWebProductDao iWebProduct;

    public int deleteById(String id){
        return iWebProduct.deleteById(id);
    }

    public int insert(WebProduct record){
        return iWebProduct.insert(record);
    }

    public List<WebProduct> selectByExample(WebProduct example){
        return iWebProduct.selectByExample(example);
    }

    public WebProduct selectById(String id){
        return iWebProduct.selectById(id);
    }

    public int updateById(WebProduct entity){
        return iWebProduct.updateById(entity);
    }
}
