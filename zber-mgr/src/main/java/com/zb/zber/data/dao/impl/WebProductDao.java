package com.zb.zber.data.dao.impl;

import com.zb.zber.common.core.persistence.db.dao.mybatis.SuperDao;
import com.zb.zber.data.dao.IWebProductDao;
import com.zb.zber.data.model.WebProduct;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by cuixt on 2018/9/28.
 */
@Component
public class WebProductDao extends SuperDao implements IWebProductDao {
    @Override
    public int deleteById(String id) {
        return super.delete("com.zb.zber.data.model.WebProduct.deleteById",id);
    }

    @Override
    public int insert(WebProduct record) {
        record.preInsert();
        return super.insert("com.zb.zber.data.model.WebProduct.insert",record);
    }

    @Override
    public List<WebProduct> selectByExample(WebProduct example) {
        return super.selectList("com.zb.zber.data.model.WebProduct.selectByExample",example);
    }

    @Override
    public WebProduct selectById(String id) {
        return super.selectOne("com.zb.zber.data.model.WebProduct.selectById",id);
    }

    @Override
    public int updateById(WebProduct example) {
        example.preUpdate();
        return super.update("com.zb.zber.data.model.WebProduct.updateById",example);
    }
}
