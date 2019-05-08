package com.zb.zber.data.controller;

import com.zb.zber.common.core.exception.BusinessException;
import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.common.utils.ParamCheckUtils;
import com.zb.zber.common.web.comp.ace.ResponseMessage;
import com.zb.zber.common.web.comp.ace.i18n.MessageResolver;
import com.zb.zber.data.model.News;
import com.zb.zber.data.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by cuixt on 2018/11/1.
 */
@RequestMapping("/news")
@Controller
public class NewsController {

    @Autowired
    private INewsService iNewService;

    /**
     * 新闻列表
     * @param page
     * @param news
     * @param request
     * @return
     */
    @RequestMapping(value={"/list"}, produces={"application/json"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    @ResponseBody
    public ResponseMessage getNewsList(PaginationOrdersList<News> page, News news, HttpServletRequest request, HttpServletResponse response){
        response.addHeader("Access-Control-Allow-Origin", "*");
        return ResponseMessage.success(iNewService.selectByNews(page,news));
    }

    /**
     * 添加新闻
     * @param news
     * @param request
     * @return
     */
    @RequestMapping(value={"/add"},produces = {"application/json"},method = RequestMethod.POST)
    @ResponseBody
    public ResponseMessage addNews( News news,HttpServletRequest request, HttpServletResponse response){
        try {
            response.addHeader("Access-Control-Allow-Origin", "*");
            ParamCheckUtils.notAllNull(new Object[]{news.getName(),news.getTitle(),news.getAuthor(),news.getContent(),news.getStatus(),news.getTopic()},
                    new String[]{"name","title","author","content","status","topic"});
            iNewService.insert(news);
            return ResponseMessage.success();
        } catch (BusinessException e) {
            return ResponseMessage.error((String) e.getValue(), MessageResolver.getMessage(request, (String) e.getValue(), e.getPlaceholders()));
        }
    }

    /**
     * 更新
     * @param news
     * @param request
     * @return
     */
    @RequestMapping(value={"/update"},produces = {"application/json"},method = RequestMethod.POST)
    @ResponseBody
    public ResponseMessage updateNews(@RequestBody News news,HttpServletRequest request, HttpServletResponse response){
        try {
            response.addHeader("Access-Control-Allow-Origin", "*");
            ParamCheckUtils.notAllNull(new Object[]{news.getId(),news.getName(),news.getTitle(),news.getAuthor(),news.getContent(),news.getStatus(),news.getTopic()},
                    new String[]{"ID","name","title","author","content","status","topic"});
            iNewService.updateById(news);
            return ResponseMessage.success();
        } catch (BusinessException e) {
            return ResponseMessage.error((String) e.getValue(), MessageResolver.getMessage(request, (String) e.getValue(), e.getPlaceholders()));
        }
    }

    @RequestMapping(value={"/detail/{id}"}, produces={"application/json"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    @ResponseBody
    public ResponseMessage getProductDetail(@PathVariable String id, HttpServletRequest request, HttpServletResponse response)
    {
        try
        {
            response.addHeader("Access-Control-Allow-Origin", "*");
            ParamCheckUtils.notAllNull(new Object[] { id }, new String[] { "id" });
            News news = iNewService.selectById(id);

            return ResponseMessage.success(news);
        }
        catch (BusinessException e)
        {
            return ResponseMessage.error((String)e.getValue(),MessageResolver.getMessage(request, (String)e.getValue(), e.getPlaceholders()));
        }
    }

}
