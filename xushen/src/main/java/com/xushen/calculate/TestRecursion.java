package com.xushen.calculate;/**
 * @Author:Created by sh00974
 * @Date on 2018/12/6.
 */

/**
 *@author gaohailiang
 *@date created on 2018/12/6
 */
public class TestRecursion {


    public int calNMulti(int n,int sum) {
        if(n > 0){
            sum=n+this.calNMulti(n-1,sum);
            n=n-1;
        };
        return sum;
    }
                                         

    public static void main(String[] args) {
        System.out.println(new TestRecursion().testRecursion(10,0));
        System.out.println(new TestRecursion().calNMulti(10,0));
    }

    /**
     * 递归
     * @param n
     * @param sum
     * @return
     */
    public int  testRecursion(int n,int sum){
        if(n>0){
           sum=n+this.testRecursion(n-1,sum);
           n=n-1;
        }
       return sum;
    }



}
