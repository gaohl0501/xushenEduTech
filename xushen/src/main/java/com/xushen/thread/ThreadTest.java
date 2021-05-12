package com.xushen.thread;/**
 * @Author:Created by sh00974
 * @Date on 2018/11/13.
 */

/**
 *@author gaohailiang
 *@date created on 2018/11/13
 */
public class ThreadTest extends  Thread{

    public static void main(String[] args) {
        Thread t=new ThreadTest(){

            @Override
            public void run() {
                test();
            }


        };
        t.start();
    }
    ThreadTest(){
        System.out.print("pang");
    }


    public static void test(){
        System.out.println("ping");
    }
}
