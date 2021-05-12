package com.xushen.testabstract;/**
 * @Author:Created by sh00974
 * @Date on 2018/12/12.
 */

/**
 *@author gaohailiang
 *@date created on 2018/12/12
 */
public abstract class TestAbstract  {

    TestAbstract ab=new TestAbstract() {
        @Override
        public int hashCode() {
            return super.hashCode();
        }
    };

}
