package com.zb.zber.data.dao;

import com.zb.zber.data.model.Admin;

/**
 * Created by cuixt on 2018/8/2.
 */

public interface IAdminDao {

    Admin selectById(String id);

    Admin getUserByName(String name);

    int updateById(Admin record);
}
