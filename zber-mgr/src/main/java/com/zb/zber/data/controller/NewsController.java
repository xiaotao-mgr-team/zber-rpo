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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by cuixt on 2018/11/1.
 */
@RequestMapping("/news")
@Controller
public class NewsController {

    @Autowired
    private INewsService INewService;

    /**
     * 新闻列表
     * @param page
     * @param news
     * @param request
     * @return
     */
    @RequestMapping(value={"/list"}, produces={"application/json"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    @ResponseBody
    public ResponseMessage getNewsList(PaginationOrdersList<News> page, News news, HttpServletRequest request){
        return ResponseMessage.success(INewService.selectByNews(page,news));
    }

    /**
     * 添加新闻
     * @param news
     * @param request
     * @return
     */
    @RequestMapping(value={"/add"},produces = {"application/json"},method = RequestMethod.POST)
    @ResponseBody
    public ResponseMessage addNews( News news,HttpServletRequest request){
        try {
            ParamCheckUtils.notAllNull(new Object[]{news.getName(),news.getTitle(),news.getAuthor(),news.getContent(),news.getStatus(),news.getTopic()},
                    new String[]{"name","title","author","content","status","topic"});
            INewService.insert(news);
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
    public ResponseMessage updateNews(@RequestBody News news,HttpServletRequest request){
        try {
            ParamCheckUtils.notAllNull(new Object[]{news.getId(),news.getName(),news.getTitle(),news.getAuthor(),news.getContent(),news.getStatus(),news.getTopic()},
                    new String[]{"ID","name","title","author","content","status","topic"});
            INewService.updateById(news);
            return ResponseMessage.success();
        } catch (BusinessException e) {
            return ResponseMessage.error((String) e.getValue(), MessageResolver.getMessage(request, (String) e.getValue(), e.getPlaceholders()));
        }
    }

}
