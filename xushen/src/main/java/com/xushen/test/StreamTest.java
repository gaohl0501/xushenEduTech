package com.xushen.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sh00974 on 2018/3/14.
 */
public class StreamTest {
    public static void
    ain(String[] args) {
        long start=System.currentTimeMillis();
        List<Long> ls=new StreamTest().getS();
//        ls.parallelStream().forEach(s->new StreamTest().getNumber(s));
    }

    public List<Long> getS(){
        List<Long> ls=new ArrayList<Long>();
        for(long i=0;i<100000000;i++){
            ls.add(i);
        }
        return ls;
    }
    public Long getNumber(Long s){
        s=s+s;
        return s;
    }

}
