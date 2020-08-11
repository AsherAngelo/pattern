package com.test.proxy.jdk;

import com.test.proxy.Father;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: zhaomengjie
 * @Date: 2020/8/2 17:00
 * @Version 1.0
 */
public class JdkProxy implements InvocationHandler {

    private Father target;

    public Object getInstance(Father father){
        this.target = father;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置方法");
        method.invoke(this.target,args);
        System.out.println("后置方法");
        return null;
    }
}
