package com.zb.zber.data.init;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * 初始化设计
 * Created by cuixt on 2018/9/17.
 */
public class ApplicationStartup implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
//        RootConfigInitor rt = new RootConfigInitor();
//        rt.init();
    }
}
