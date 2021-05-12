package com.xushen.testspring;/**
 * @Author:Created by sh00974
 * @Date on 2018/11/13.
 */

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 *@author gaohailiang
 *@date created on 2018/11/13
 */
public class TestBeanPostProcessor implements BeanPostProcessor{

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof User){
            User user = (User) bean;
            user.setUserName("zhaosongqiang");
        }
        return bean;
    }



}
