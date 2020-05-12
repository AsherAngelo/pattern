package com.pattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: zhaomengjie
 * @Date: 2020/5/11 21:49
 * @Version 1.0
 */
public class Cglibmeipo implements MethodInterceptor {
    public Object getInstance(Class<?> clazz){
        Enhancer enhancer = new Enhancer();
        //要把那个类设置为即将生成类的父类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //业务增强
        System.out.println("1");
        methodProxy.invokeSuper(o,objects);
        System.out.println("2");
        return null;
    }
}
