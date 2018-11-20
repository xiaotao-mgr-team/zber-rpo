package com.zb.zber.common.core.context.spring.quartz;

import com.zb.zber.common.core.context.app.cfg.initor.RootConfigInitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

/**
 *  QuartzFactoryBean检测机制，检测启动的QuartzFactoryBean是否为自定义的TaskSchedulerFactoryBean，如果不是就启动失败，否则OK
 *
 */
public class QuartzFactoryBeanPostProcessor implements BeanPostProcessor {

    /**
     *
     */
    private static final Logger _logger = LoggerFactory.getLogger(QuartzFactoryBeanPostProcessor.class);

    /**
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    /**
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
      if (!(bean instanceof SchedulerFactoryBean)) {
          return bean;
      }
      _logger.info("check quartz FactoryBean object for '" + beanName + "'.");
      String enableQuartz = null;
      try {
    	  enableQuartz = (String) RootConfigInitor.PARAMS.get("task.quartz.backup.enable", null);
	} catch (Exception e) {
		e.printStackTrace();
	}
//	  if("true".equals(enableQuartz)){
//		  AssertUtilies.isTrue(bean.getClass().equals(TaskSchedulerFactoryBean.class), "QuartzFactoryBean  must extends  TaskSchedulerFactoryBean !!!");
//	  }
      return bean;
    }
    

}
