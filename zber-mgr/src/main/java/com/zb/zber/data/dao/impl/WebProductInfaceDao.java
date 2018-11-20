package com.zb.zber.data.dao.impl;

import com.zb.zber.common.core.persistence.db.dao.mybatis.SuperDao;
import com.zb.zber.data.dao.IWebProductInfaceDao;
import com.zb.zber.data.model.WebProductInface;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by cuixt on 2018/9/28.
 */
@Component
public class WebProductInfaceDao extends SuperDao implements IWebProductInfaceDao {
    @Override
    public int deleteById(String id) {
        return super.delete("com.zb.zber.data.model.WebProductInface.deleteById",id);
    }

    @Override
    public int insert(WebProductInface record) {
        record.preInsert();
        return super.insert("com.zb.zber.data.model.WebProductInface.insert",record);
    }

    @Override
    public List<WebProductInface> selectByExample(WebProductInface example) {
        return super.selectList("com.zb.zber.data.model.WebProductInface.selectByExample",example);
    }

    @Override
    public WebProductInface selectById(String id) {
        return super.selectOne("com.zb.zber.data.model.WebProductInface.selectById",id);
    }

    @Override
    public int updateById(WebProductInface webProductInface) {
        return super.update("com.zb.zber.data.model.WebProductInface.updateById",webProductInface);
    }
}
