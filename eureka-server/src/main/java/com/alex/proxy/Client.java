/*
 * 深圳市灵智数科有限公司版权所有.
 */
package com.alex.proxy;

import java.lang.reflect.Proxy;

/**
 * 类说明
 * <p>
 *
 * @author ： minwei
 * @version ：1.0.0
 * @date ：2021-1-27
 */
public class Client {

    public static void main(String[] args) {
        Hello hello = new Hello();
        HelloProxy helloProxy = new HelloProxy(hello);
        HelloInterface helloInterface = (HelloInterface)Proxy.newProxyInstance(helloProxy.getClass().getClassLoader(), hello.getClass().getInterfaces(), helloProxy);
        helloInterface.sayHello();
    }
}
