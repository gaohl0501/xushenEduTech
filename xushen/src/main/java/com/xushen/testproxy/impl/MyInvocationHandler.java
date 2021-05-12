package com.xushen.testproxy.impl;/**
 * @Author:Created by sh00974
 * @Date on 2018/11/13.
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *@author gaohailiang
 *@date created on 2018/11/13
 */
public class MyInvocationHandler implements InvocationHandler {
    private Object target; //们既然要做代理，我们必须知道我们是给谁做代理，这里的obj就是被代理者。

    MyInvocationHandler() {
        super();
    }

    public MyInvocationHandler(Object target) {
        super();
        this.target = target;
    }

    //然后是invoke的三个参数、第一个参数就是代理者，如果你想对代理者做一些操作可以使用这个参数；第二个就是被执行的方法，第三个是执行该方法所需的参数。
    @Override
    public Object invoke(Object o, Method method, Object[] args) throws Throwable {  //把我们想要通过代理者给被代理者追加的操作都写在invoke方法里面
        if("getName".equals(method.getName())){
            System.out.println("++++++before " + method.getName() + "++++++");
            Object result = method.invoke(target, args);
            System.out.println("++++++after " + method.getName() + "++++++");
            return result;
        }else{
            Object result = method.invoke(target, args);
            return result;
        }

    }

}
