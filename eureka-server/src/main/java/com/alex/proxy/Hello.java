/*
 * 深圳市灵智数科有限公司版权所有.
 */
package com.alex.proxy;

/**
 * 类说明
 * <p>
 *
 * @author ： minwei
 * @version ：1.0.0
 * @date ：2021-1-27
 */
public class Hello implements HelloInterface {

    @Override
    public void sayHello(){
        System.out.println("Hello Aaron");
    }
}
