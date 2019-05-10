package com.zb.zber.data.common;

import com.google.common.collect.Maps;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by cuixt on 2019/4/18.
 */
public abstract class CommonUtils {

    public static List<String> getProductList(String msg){
        msg = msg.replace("[","【");
        msg = msg.replace("]","】");
        List<String> list = new ArrayList<String>();
        int start = 0;
        int startFlag = 0;
        int endFlag = 0;
        int index = 0;
        for (int i = 0; i < msg.length(); i++) {
            if (msg.charAt(i) == '【') {
                startFlag++;
                if (startFlag == endFlag + 1) {
                    start = i;
                }
            } else if (msg.charAt(i) == '】') {
                endFlag++;
                if (endFlag == startFlag) {
                    list.add(msg.substring(start + 1, i));
                }
            }
        }
        return list;
    }

    public static Map<String,String> getProductMaps(String msg){

        msg = msg.replace("[","【");
        msg = msg.replace("]","】");
        Map<String,String> maps = Maps.newHashMap();

        int start = 0;
        int startFlag = 0;
        int endFlag = 0;
        int index = 0;
        for (int i = 0; i < msg.length(); i++) {
            if (msg.charAt(i) == '【') {
                startFlag++;
                if (startFlag == endFlag + 1) {
                    start = i;
                }
            } else if (msg.charAt(i) == '】') {
                endFlag++;
                if (endFlag == startFlag) {
                    maps.put(String.valueOf(index),msg.substring(start + 1, i));
                    index ++;
                }
            }
        }
        return maps;
    }

    public static String getTicket(String msg){

        if(StringUtils.isBlank(msg)){
            return "";
        }

        String tickType  = "5P";
        if(msg.contains("专票")){
            tickType = "10P";
        }
        return tickType;
    }

    public static String getRemarks(String msg){

        msg = msg.replace("（","(");
        msg = msg.replace("）",")");

        int start = 0;
        int startFlag = 0;
        int endFlag = 0;
        String tickerInfo = "";
        for (int i = 0; i < msg.length(); i++) {
            if (msg.charAt(i) == '(') {
                startFlag++;
                if (startFlag == endFlag + 1) {
                    start = i;
                }
            } else if (msg.charAt(i) == ')') {
                endFlag++;
                if (endFlag == startFlag) {
                    tickerInfo =  msg.substring(start, i+1);
                    break;
                }
            }
        }

        return tickerInfo;
    }

    public static String getNumber(String tickerInfo) {
        Pattern pattern = Pattern.compile("[^0-9]");
        Matcher matcher = pattern.matcher(tickerInfo);
        return matcher.replaceAll("");
    }

    public static void main(String[] args) {

//        String msg = "【湖南省邵阳市双清区 汽车站街道 东大路55号 胡进平， 18007397701】【1台，单人用风机（只有机器双开关）】【专票，1655】";
//
//        getProductMaps(msg);

        String mgs2 = "单人电动送风（只要机器，双开关）";

        System.out.println(getRemarks(mgs2));
    }
}
