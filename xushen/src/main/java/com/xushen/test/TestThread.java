package com.xushen.test;/**
 * @Author:Created by sh00974
 * @Date on 2018/8/31.
 */

import com.xushen.thread.ThreadTemp;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *@author gaohailiang
 *@date created on 2018/8/31
 */
public class TestThread {


    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(15);
        for(int i=0;i<15;i++){
            Thread thread=new ThreadTemp();
            executor.execute(thread);
        }
        executor.shutdown();
    }


}
