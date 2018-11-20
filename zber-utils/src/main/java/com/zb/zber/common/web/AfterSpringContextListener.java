/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zb.zber.common.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * wub
 * 容器后置处理器
 */
public class AfterSpringContextListener implements ServletContextListener {

    private static final Logger _logger = LoggerFactory.getLogger(AfterSpringContextListener.class);

    /**
     *
     * @param sce
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
      
    }


    /**
     *
     * @param sce
     */
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }



}
