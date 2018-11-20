package com.zb.zber.common.utils;

import java.io.IOException;
import java.lang.Process;

/**
 * shell命令调用且根据返回值是否为0判断是不是成功
 * @author jiangxia
 * @date 2017年1月16日 上午9:20:11 
 * @version V1.1.0
 */
public class ShellExeUtilies {
    
    
    public static boolean ShellExe(String shellString) throws IOException, InterruptedException
    {
        if(StringUtilies.isNullOrEmpty(shellString))
        {
            return true;
        }
        
        Process process = Runtime.getRuntime().exec(shellString);  
        int exitValue = process.waitFor();  
        if (0 == exitValue) 
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
