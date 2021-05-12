package com.xushen.test_Resource;/**
 * @Author:Created by sh00974
 * @Date on 2018/7/18.
 */

import com.xushen.XushenApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



/**
 *@author gaohailiang
 *@date created on 2018/7/18
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = XushenApplication.class)
public class TestResource {
    @Autowired
    private Man  manImpl;


    @Test
    public void te() {
        Man s=this.manImpl;
        System.out.println(s);

    }

}
