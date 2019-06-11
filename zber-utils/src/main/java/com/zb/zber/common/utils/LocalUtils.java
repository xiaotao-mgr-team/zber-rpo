package com.zb.zber.common.utils;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import org.apache.commons.collections.CollectionUtils;

import java.util.List;
import java.util.Map;

/**
 * Created by cuixt on 2019/6/10.
 */
public class LocalUtils {

    public static List<String> proviceMaps(){

        List<String> lists = Lists.newArrayList();

        String str  = LocalMaps.LOCAL_LIST;
        JSONObject object = JSONObject.parseObject(str);
        for (Map.Entry<String, Object> entry : object.entrySet()) {
            lists.add(entry.getKey());
        }
        return lists;
    }

    public static String proviceString(){

        List<String> lists = proviceMaps();

        return String.join(",",lists);
    }

    public static List<String> citysMaps(String provice){
        List<String> citysLsit = Lists.newArrayList();

        String str  = LocalMaps.LOCAL_LIST;
        JSONObject object = JSONObject.parseObject(str);
        for (Map.Entry<String, Object> entrys : object.entrySet()) {
            if(provice.equals(entrys.getKey()) || provice.contains(entrys.getKey())){
                JSONObject dtailOnject = (JSONObject) entrys.getValue();
                for (Map.Entry<String, Object> entry : dtailOnject.entrySet()) {
                    citysLsit.add(entry.getKey());
                }
                break;
            }
        }
        return citysLsit;
    }

    public static String citysString(String provice){

        String returnStr = "";
        List<String> citysLsit = citysMaps(provice);
        if(CollectionUtils.isNotEmpty(citysLsit)){
            returnStr = String.join(",",citysLsit);
        }
        return returnStr;
    }



    public static void main(String[] args){

    }
}
