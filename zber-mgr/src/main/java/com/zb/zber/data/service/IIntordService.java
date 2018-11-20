package com.zb.zber.data.service;


import com.zb.zber.data.model.Intord;

public interface IIntordService {

    Intord selectById(String id);

    int updateById(Intord record);

}