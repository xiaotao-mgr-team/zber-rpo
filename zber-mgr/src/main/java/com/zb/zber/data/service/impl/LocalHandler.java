package com.zb.zber.data.service.impl;

import com.whalin.MemCached.MemCachedClient;
import com.zb.zber.common.utils.LocalUtils;
import com.zb.zber.data.service.ILocalHandler;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by cuixt on 2019/6/11.
 */
@Service
public class LocalHandler implements ILocalHandler {

    @Autowired
    private MemCachedClient memCachedClient;

    public String getProAndCity(String address){

        String pc = "";

        String provice = getProviceList();
        if(StringUtils.isBlank(provice)){
            pc = address;
        }

        List<String> provices = Arrays.asList(provice.split(","));

        for(String p:provices){
            if(address.contains(p)){
                pc =  p+getCity(p,address);
                break;
            }
        }

        return pc;
    }

    public String getProviceList(){

        String provice = (String) memCachedClient.get("PRODUCT_ADDRESS_PROVINCE_LIST");

        if(StringUtils.isBlank(provice)){
            provice = LocalUtils.proviceString();

            if(StringUtils.isBlank(provice)){
                return provice;
            }else {
                memCachedClient.set("PRODUCT_ADDRESS_PROVINCE_LIST",provice);
            }
        }
        return provice;
    }

    public String getCityList(String provice){

        String city = (String) memCachedClient.get("PRODUCT_ADDRESS_CITY_LIST"+provice);
        if(StringUtils.isBlank(city)){
            city = LocalUtils.citysString(provice);

            if(StringUtils.isBlank(city)){
                return city;
            }else {
                memCachedClient.set("PRODUCT_ADDRESS_CITY_LIST"+provice,city);
            }
        }
        return city;
    }

    public String getCity(String provice,String address){

       String citys =  getCityList(provice);

       if(StringUtils.isBlank(citys)){
           citys = "-";
       }
       List<String> cityList = Arrays.asList(citys.split(","));

       for(String s:cityList){
           if(address.contains(provice) && address.contains(s)){
               citys = s;
               continue;
           }
       }
        return citys;

    }
}
