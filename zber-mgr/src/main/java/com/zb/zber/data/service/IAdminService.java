package com.zb.zber.data.service;

import com.zb.zber.common.core.exception.BusinessException;
import com.zb.zber.data.model.Admin;

/**
 * Created by cuixt on 2018/10/10.
 */
public interface IAdminService {
    Admin login(Admin paramAdmin) throws BusinessException;
}
