/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zb.zber.common.utils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * 日期工具类
 * @author wubin
 * @date 2016年7月28日 下午4:27:24 
 * @version V1.1.0
 */
public class DatetimeUtilies
{
    public static final String YYYYMMDDHHMMSS = "yyyyMMddHHmmss";
    
    public static final String DATE_TIME = "yyyy-MM-dd HH:mm:ss";
    
    public static final String DATE_TIME_MS = "yyyy-MM-dd HH:mm:ss:SSS";
    
    public static final String DATE_TIME_MIN = "yyyy-MM-dd HH:mm";
    
    public static final String DATE = "yyyy-MM-dd";
    
    public static final String TIME = "HH:mm:ss";
    
    public static final String DATE_HOUR = "yyyy-MM-dd HH";
    
    public static final String DATE_SHORT = "yyMMdd";
    
    /**
     * 获取当前时间秒数
     * 
     * @return String
     */
    public static String getCurrTime10()
    {
        return "" + System.currentTimeMillis() / 1000;
    }
    
    
    /**
     * 检查给定的日期是否在两个日期中间
     *
     * @param current compare date
     * @param min min date
     * @param max max date
     * @return if between min date and max date, then return true.
     */
    public static boolean between(Date current, Date min, Date max)
    {
        return current.after(min) && current.before(max);
    }

    /**
     * return current time by timestamp.
     *
     * @return
     */
    public static Timestamp currentTime()
    {
        return new Timestamp(System.currentTimeMillis());
    }
    
    /**
     *
     * @return
     */
    public static Date currentDay()
    {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        return c.getTime();
    }
    
    /**
     *
     * @param date
     * @return
     */
    public static boolean beforeToday(Date date)
    {
        Date today = currentDay();
        return date.before(today);
    }
    
    /**
     * get the days between give date range.
     *
     * @param from begin date
     * @param to end date
     * @return days
     */
    public static int daysBetween(Date from, Date to)
    {
        long t = to.getTime() - from.getTime();
        return Integer.valueOf(t / 1000 / 60 / 60 / 24 + "");
    }


    /**
     * return current month range.
     *
     * @return [0] begin date, [1] end date
     */
    public static Date[] getCurrentMonth()
    {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH));
        Date date1 = cal.getTime();
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        Date date2 = cal.getTime();
        return new Date[] {date1, date2};
    }
    
    /**
     * get current quarter.
     *
     * @return quarter number
     */
    public static int getCurrentQuarter()
    {
        Calendar calendar = Calendar.getInstance();
        int mh = calendar.get(Calendar.MONTH) + 1;
        int qr = (mh - (mh - 1) % 3 + 2) / 3;
        return qr;
    }
    
    /**
     *
     * @param date1
     * @param date2
     * @return
     */
    public static boolean dateEquals(Date date1, Date date2)
    {
        boolean eq = true;
        if ((date1 != null && date2 == null) || (date2 != null && date1 == null))
        {
            eq = false;
        }
        else if (date1 != null && date2 != null)
        {
            eq = date1.getTime() == date2.getTime();
        }
        return eq;
    }
    
    /**
     * 获取本地时间的当前时间戳.<br>
     * 1. 时间戳格式为：yyyyMMddHHmmss<br>
     * 
     * @return 时间戳字符串
     * @author LiCunjing
     */
    public static String getCurTimestampStr()
    {
        SimpleDateFormat formatter = new SimpleDateFormat(YYYYMMDDHHMMSS);
        
        return formatter.format(new Date());
    }
    
    // 通过时间格式格式化时间
    public static String formatDateTime(String pattern, Date date)
    {
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        
        return formatter.format(date);
    }
    
    /**
     * 当前时间加上固定秒数<br>
     * 
     * @return 时间
     * @author zhangchangshun
     */
    public static Date addSecond(Date date, int seconds)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.SECOND, seconds);
        return calendar.getTime();
    }
    
    /**
     * 将指定格式的时间字符串转为Date对象<br>
     * 1. timeString的格式必须符合pattern，否则抛出异常。<br>
     * 
     * @param pattern 时间格式
     * @param timeString 时间字符串
     * @return Date类型时间
     * @throws ParseException 时间字符串解析失败，pattern与timeString不符
     * @author LiCunjing
     */
    public static Date parse(String pattern, String timeString)
        throws ParseException
    {
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        return format.parse(timeString);
    }
    
    /**
     * 计算当天剩余秒数
     * 
     * @return
     */
    public static int getRemainSeconds()
    {
        Calendar calendar = Calendar.getInstance();
        long startTime = calendar.getTimeInMillis();
        calendar.add(Calendar.DAY_OF_YEAR, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        long endTime = calendar.getTimeInMillis();
        int time = (int)((endTime - startTime) / 1000);
        return time;
    }
    
    /**
     * 获取系统指定天数之前的时间
     * @author Oliver
     * @param days
     * @return
     */
    public static Date getSpecifyDaysAgo(int days)
    {
        Calendar calendar = Calendar.getInstance();
        
        calendar.add(Calendar.DAY_OF_MONTH, -days);
        return calendar.getTime();
    }
    
    
    /**
     * 获得某天的零点时刻0:0:0
     * 
     * @param date
     *            日期
     * @return
     */
    public static Date getDayBegin(Date date) {

        if (date == null)
            return null;
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }
    
    /**
     * 获得某天的截至时刻23:59:59
     * 
     * @param date
     * @return
     */
    public static Date getDayEnd(Date date) {

        if (date == null)
            return null;
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }
    
    /**
     * 2个时间之间的时间差
     * 
     * @author xiaotao
     * @return
     */
    public static int calLastedTime(Date startDate,Date endDate) {
        long a = endDate.getTime();
        long b = startDate.getTime();
        int c = (int) ((a - b) / 1000);
        return c;
    }
    
    /**
     * 获得当月的初始时刻
     * 
     * @param date
     *            日期
     * @return
     */
    public static Date getMonthBegin(Date date) {

        if (date == null)
            return null;
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        return cal.getTime();
    }
    
    /**
     * 获得当年的初始时刻
     * 
     * @param date
     *            日期
     * @return
     */
    public static Date getYearBegin(Date date) {

        if (date == null)
            return null;
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        cal.set(Calendar.DAY_OF_MONTH, 0);
        cal.set(Calendar.DAY_OF_YEAR, 1);
        return cal.getTime();
    }
    
    
    /**
     * 获取两个日期之间的日期
     * @param start 开始日期
     * @param end 结束日期
     * @return 日期集合
     */
    public static List<String> getBetweenDates(Date start, Date end) {
        List<String> result = new ArrayList<String>();
        Calendar tempStart = Calendar.getInstance();
        tempStart.setTime(start);
        
        Calendar tempEnd = Calendar.getInstance();
        tempEnd.setTime(end);
        while (!tempStart.after(tempEnd)) {
            result.add(formatDateTime(DATE, tempStart.getTime()));
            tempStart.add(Calendar.DAY_OF_YEAR, 1);
        }
        return result;
    }
    
    public static void main(String[] args)
    {
        System.out.println( getMonthBegin(new Date()));
        System.out.println( getYearBegin(new Date()));
        System.out.println( getDayBegin(new Date()));
        
    }
}
