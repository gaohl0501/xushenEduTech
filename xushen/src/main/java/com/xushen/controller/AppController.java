package com.xushen.controller;/**
 * @Author:Created by sh00974
 * @Date on 2018/11/9.
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@author gaohailiang
 *@date created on 2018/11/9
 */
@RestController
@ComponentScan
public class AppController {
    @Value("name")
    String name ;
    @RequestMapping("/testc")
    public String  testC(@PathVariable("name") String name){


        return null;
    }

}
