package com.test.proxy.cglib;

import com.test.proxy.Father;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: zhaomengjie
 * @Date: 2020/8/2 17:15
 * @Version 1.0
 */
public class CglibProxy implements MethodInterceptor {

    public Object getInstance(Class<?> clazz) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("前置方法");
        methodProxy.invokeSuper(o,objects);
        System.out.println("后置方法");
        return null;
    }
}
