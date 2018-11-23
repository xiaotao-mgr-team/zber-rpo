package com.zb.zber.data.handler;

import com.google.common.collect.Lists;
import com.zb.zber.common.core.context.app.cfg.initor.RootConfigInitor;
import com.zb.zber.common.utils.FileUtilies;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by cuixt on 2018/8/10.
 */
public class UrlHandler {
    private static Logger logger = LoggerFactory.getLogger(UrlHandler.class);

    public static String getImageUrlWithSuffix(String UrlCode, String domain)
    {
        String path = FilePathHandler.getRootDownImageUrl() + "/" + domain + "/" + UrlCode + ".jpg";
        return path;
    }

    public static String getImageUrlWithOutSuffix(String UrlCode, String domain)
    {
        String path = SystemConfig.getProperty("img.form.down.path") + "/" + domain + "/" + UrlCode;
        return path;
    }

    public static List<String> getImagesUrlWithOutSuffix(String urlCode, String domain)
    {
        List<String> urlCodeList = Arrays.asList(urlCode.split(","));
        List<String> urls = Lists.newArrayList();
        if(!CollectionUtils.isEmpty(urlCodeList)){
            for(String url:urlCodeList){
                urls.add(SystemConfig.getProperty("img.form.down.path") + "/" + domain + "/" + url);
            }
        }
        return urls;
    }

    public static String getFileUrlWithOutSuffix(String UrlCode, String domain)
    {
        String path = FilePathHandler.getRootDownFileToolUrl() + "/" + domain + "/" + UrlCode;
        return path;
    }

    public static void copyFile(String imageUrl, String urlCode, String type)
    {
        try
        {
            String tempPath = (String) RootConfigInitor.PARAMS.get("file.root.upload.temp.path", "http://www.zbering.com/data/temp/img/");
            String normalPath = (String)RootConfigInitor.PARAMS.get("file.root.upload.formal.path", "http://www.zbering.com/data/formal/img/");
            normalPath = normalPath + "/" + type;
            tempPath = tempPath + "/" + type;
            normalPath = normalPath + "/" + urlCode;
            if (!FileUtilies.checkPathExist(normalPath)) {
                throw new FileNotFoundException("image.upload.err");
            }
            StringBuffer sb = new StringBuffer();
            sb.append(normalPath).append("/").append(imageUrl);
            FileCopyUtils.copy(new File(tempPath + "/" + imageUrl), new File(sb.toString()));
        }
        catch (IOException e)
        {
            logger.error("file copy fail==================" + e.getMessage());
        }
    }
}
