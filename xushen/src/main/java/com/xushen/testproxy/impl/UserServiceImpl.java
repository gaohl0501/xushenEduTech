package com.xushen.testproxy.impl;/**
 * @Author:Created by sh00974
 * @Date on 2018/11/13.
 */

import com.xushen.testproxy.UserService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 *@author gaohailiang
 *@date created on 2018/11/13
 */
public class UserServiceImpl implements UserService ,BeanPostProcessor {

    @Override
    public String getName(String name) {
        System.out.println("----getName------");
        return "Tom";
    }

    @Override
    public int getAge(int age) {
        System.out.println("----getAge----");
        return 10;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }
}
