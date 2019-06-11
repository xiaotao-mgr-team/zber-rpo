package com.zb.zber.data.service.impl;

import com.zb.zber.data.service.IMobileHandler;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by cuixt on 2019/6/11.
 */
@Service
public class MobileHandler implements IMobileHandler {

    /**
     * 查询符合的手机号码
     */
    public String checkCellphone(String address){

        String celPhone = "";

        if(StringUtils.isBlank(address)){
            celPhone = "-";
        }

        Pattern pattern = Pattern.compile("((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(18[0,5-9]))\\d{8}");

        Matcher matcher = pattern.matcher(address);
        while(matcher.find()){
            celPhone = matcher.group();
            break;
        }
        return celPhone;
    }

    public static void main(String[] args){
        String str="江苏苏州工业园区翠儿  18963658752";
    }
}
