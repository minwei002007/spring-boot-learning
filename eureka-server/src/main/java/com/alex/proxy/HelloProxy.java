/*
 * 深圳市灵智数科有限公司版权所有.
 */
package com.alex.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 类说明
 * <p>
 *
 * @author ： minwei
 * @version ：1.0.0
 * @date ：2021-1-27
 */
public class HelloProxy implements InvocationHandler {

    private Object object;

    public HelloProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before invoke....");
        method.invoke(object,args);
        System.out.println("After invoke....");
        return null;
    }
}
