package com.xushen.thread;/**
 * @Author:Created by sh00974
 * @Date on 2018/8/31.
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

/**
 *@author gaohailiang
 *@date created on 2018/8/31
 */
public class ThreadTemp extends  Thread{

    @Override
    public void run() {
        try {
            Logger log=Logger.getLogger(ThreadTemp.class.getName());
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            log.info(df.format(new Date()));
            Thread.sleep(60000);
            log.info(df.format(new Date()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
