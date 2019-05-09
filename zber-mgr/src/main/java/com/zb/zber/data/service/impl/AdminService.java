package com.zb.zber.data.service.impl;

import com.zb.zber.common.core.exception.BusinessException;
import com.zb.zber.common.utils.EncryptUtils;
import com.zb.zber.data.dao.IAdminDao;
import com.zb.zber.data.model.Admin;
import com.zb.zber.data.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by cuixt on 2018/8/2.
 */
@Service
public class AdminService implements IAdminService {

    @Autowired
    private IAdminDao adminMapper;

    public Admin selectAdminById(String id) {
        return adminMapper.selectById(id);
    }

    public Admin login(Admin admin) throws BusinessException
    {
        Admin  userInDB = adminMapper.getUserByName(admin.getName());

        if (userInDB == null) {
            throw new BusinessException("user.customer.mobile.notexist.password.wrong.err");
        }
        if (!userInDB.getPassword().equals(EncryptUtils.MD5Encode(admin.getPassword()))) {
            throw new BusinessException("user.customer.mobile.notexist.password.wrong.err");
        }

        userInDB.setPassword(EncryptUtils.MD5Encode(admin.getPassword()));

        return userInDB;
    }

    public static void main(String[] args) {
        System.out.println(EncryptUtils.MD5Encode("Zhaobei+123"));
    }

}
