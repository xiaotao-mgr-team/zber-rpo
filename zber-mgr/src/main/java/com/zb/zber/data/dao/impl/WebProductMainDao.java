package com.zb.zber.data.dao.impl;

import com.zb.zber.common.core.persistence.db.dao.mybatis.SuperDao;
import com.zb.zber.data.dao.IWebProductMainDao;
import com.zb.zber.data.model.WebProductMain;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by cuixt on 2018/9/28.
 */
@Component
public class WebProductMainDao extends SuperDao implements IWebProductMainDao {
    @Override
    public int deleteById(String id) {
        return super.delete("com.zb.zber.data.model.WebProductMain.deleteById",id);
    }

    @Override
    public int insert(WebProductMain record) {
        record.preInsert();
        return super.insert("com.zb.zber.data.model.WebProductMain.insert",record);
    }

    @Override
    public List<WebProductMain> selectByExample(WebProductMain example) {
        return super.selectList("com.zb.zber.data.model.WebProductMain.selectByExample",example);
    }

    @Override
    public WebProductMain selectById(String id) {
        return super.selectOne("com.zb.zber.data.model.WebProductMain.selectById",id);
    }

    @Override
    public int updateById(WebProductMain example) {
        example.preUpdate();
        return super.update("com.zb.zber.data.model.WebProductMain.updateById",example);
    }
}
