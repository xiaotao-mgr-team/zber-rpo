package com.zb.zber.data.dao;


import com.zb.zber.data.model.Intord;

public interface IIntordDao {

    Intord selectById(String id);

    int updateById(Intord record);

}