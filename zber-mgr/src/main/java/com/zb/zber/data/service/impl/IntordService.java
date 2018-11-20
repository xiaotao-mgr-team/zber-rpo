package com.zb.zber.data.service.impl;

import com.zb.zber.data.dao.IIntordDao;
import com.zb.zber.data.model.Intord;
import com.zb.zber.data.service.IIntordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by cuixt on 2018/11/5.
 */
@Service
public class IntordService implements IIntordService {

    @Autowired
    private IIntordDao intordDao;

    @Override
    public Intord selectById(String id) {
        Intord intord = intordDao.selectById(id);
        if(intord != null){
            intord.format();
        }
        return intord;
    }

    @Override
    public int updateById(Intord record) {
        return intordDao.updateById(record);
    }
}
