package com.zb.zber.data.common;

import com.google.common.collect.Maps;
import com.zb.zber.common.core.context.app.cfg.initor.RootConfigInitor;
import com.zb.zber.common.core.exception.BusinessException;
import com.zb.zber.common.utils.FileUtilies;
import com.zb.zber.common.utils.ParamCheckUtils;
import com.zb.zber.common.utils.StringUtilies;
import com.zb.zber.common.utils.UUIDUtilies;
import com.zb.zber.common.web.comp.ace.ResponseMessage;
import com.zb.zber.common.web.comp.ace.i18n.MessageResolver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Map;

/**
 * Created by cuixt on 2018/10/11.
 */
@Controller
@RequestMapping({"/common/img"})
public class ImgUploadFacade {
    private String imgPath = null;
    private static final Logger logger = LoggerFactory.getLogger(ImgUploadFacade.class);

    @RequestMapping(value={"/upload"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
    @ResponseBody
    public ResponseMessage uploadImage(@RequestParam("file1") MultipartFile file, HttpServletRequest request)
    {
        try
        {
            if (StringUtilies.isNullOrEmpty(this.imgPath))
            {
                String webPath = request.getSession().getServletContext().getRealPath("");
                String rootPath = FileUtilies.getUpperPath(webPath);
                this.imgPath = (rootPath + "/upload_image/org/temp/");
            }
            if (!FileUtilies.checkPathExist(this.imgPath)) {
                throw new BusinessException("common.business.operation.err");
            }
            String originName = file.getOriginalFilename();
            String ext = FileUtilies.getExtensionName(originName);


            String newFileName = UUIDUtilies.uuid() + "." + ext;
            String fullName = this.imgPath + newFileName;
            File dest = new File(fullName);
            file.transferTo(dest);

            return ResponseMessage.success(newFileName);
        }
        catch (BusinessException e)
        {
            return ResponseMessage.error((String)e.getValue(),
                    MessageResolver.getMessage(request, (String)e.getValue(), e.getPlaceholders()));
        }
        catch (Exception e)
        {
            return ResponseMessage.error(e.getMessage(), "image.upload.err");
        }
    }

    @RequestMapping(value={"/file/upload"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
    @ResponseBody
    public ResponseMessage uploadFile(@RequestParam("file1") MultipartFile file, Integer origin, String urlCode, HttpServletRequest request)
    {
        try
        {
            ParamCheckUtils.notAllNull(new Object[] { urlCode }, new String[] { "urlCode" });
            String path = (String) RootConfigInitor.PARAMS.get("file.root.upload.temp.path", null);
            path = path + "/" + urlCode;
            if (StringUtilies.isNullOrEmpty(path)) {
                throw new BusinessException("common.business.operation.err");
            }
            if (!FileUtilies.checkPathExist(path)) {
                throw new BusinessException("common.business.operation.err");
            }
            String originName = file.getOriginalFilename();
            String ext = FileUtilies.getExtensionName(originName);

            String code = UUIDUtilies.uuid();
            String newFileName = code + "." + ext;
            String fullName = path + "/" + newFileName;

            File dest = new File(fullName);
            file.transferTo(dest);

            String downPath = (String)RootConfigInitor.PARAMS.get("file.root.common.down.temp.path", null) + "/" + urlCode + "/" + newFileName;
            Map<String, String> map = Maps.newHashMap();
            map.put("fileName", newFileName);
            map.put("path", downPath);
            map.put("code", code);
            map.put("originName", originName);


            return ResponseMessage.success(map);
        }
        catch (BusinessException e)
        {
            return ResponseMessage.error((String)e.getValue(),
                    MessageResolver.getMessage(request, (String)e.getValue(), e.getPlaceholders()));
        }
        catch (Exception e)
        {
            return ResponseMessage.error(e.getMessage(), "image.upload.err");
        }
    }

    @RequestMapping(value={"/service/upload"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
    @ResponseBody
    public ResponseMessage uploadServiceImage(@RequestParam("file1") MultipartFile file, Integer origin, HttpServletRequest request)
    {
        try
        {
            String path = (String)RootConfigInitor.PARAMS.get("file.root.img.upload.temp.path", null);
            if (StringUtilies.isNullOrEmpty(path)) {
                throw new BusinessException("common.business.operation.err");
            }
            if (!FileUtilies.checkPathExist(path)) {
                throw new BusinessException("common.business.operation.err");
            }
            String originName = file.getOriginalFilename();
            String ext = FileUtilies.getExtensionName(originName);



            String code = UUIDUtilies.uuid();
            String newFileName = code + "." + ext;
            String fullName = path + "/" + newFileName;
            File dest = new File(fullName);
            file.transferTo(dest);

            String downPath = (String)RootConfigInitor.PARAMS.get("file.root.img.down.temp.path", null) + "/" + newFileName;
            Map<String, String> map = Maps.newHashMap();
            map.put("fileName", newFileName);
            map.put("path", downPath);
            map.put("code", code);


            logger.info("fullName ============" + fullName);
            return ResponseMessage.success(map);
        }
        catch (BusinessException e)
        {
            return ResponseMessage.error((String)e.getValue(),
                    MessageResolver.getMessage(request, (String)e.getValue(), e.getPlaceholders()));
        }
        catch (Exception e)
        {
            return ResponseMessage.error(e.getMessage(), "image.upload.err");
        }
    }

    @RequestMapping(value={"/multi_text/upload"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
    @ResponseBody
    public ResponseMessage uploadMultiTextImage(@RequestParam("upload") MultipartFile file, Integer origin, HttpServletRequest request)
    {
        try
        {
            String path = (String)RootConfigInitor.PARAMS.get("file.root.img.upload.backgroud.path", null);
            if (StringUtilies.isNullOrEmpty(path)) {
                throw new BusinessException("common.business.operation.err");
            }
            if (!FileUtilies.checkPathExist(path)) {
                throw new BusinessException("common.business.operation.err");
            }
            String originName = file.getOriginalFilename();
            String ext = FileUtilies.getExtensionName(originName);


            String newFileName = UUIDUtilies.uuid() + "." + ext;
            String fullName = path + "/" + newFileName;
            File dest = new File(fullName);
            file.transferTo(dest);

            String downPath = (String)RootConfigInitor.PARAMS.get("file.root.img.down.backgroud.path", null) + "/" + newFileName;
            return ResponseMessage.successStringBiz(downPath);
        }
        catch (BusinessException e)
        {
            return ResponseMessage.error((String)e.getValue(),
                    MessageResolver.getMessage(request, (String)e.getValue(), e.getPlaceholders()));
        }
        catch (Exception e)
        {
            return ResponseMessage.error("/service/upload" + e.getMessage(), "image.upload.err");
        }
    }
}
