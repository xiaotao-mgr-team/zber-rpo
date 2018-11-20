package com.zb.zber.data.common;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * Created by cuixt on 2018/8/21.
 */
public class ApplicationStartup implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
//        IPermissionService service = contextRefreshedEvent.getApplicationContext().getBean(IPermissionService.class);
//        service.loadUserPermissionIntoRedis();
    }
}
