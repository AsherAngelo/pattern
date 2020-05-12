package com.pattern.proxy.jdk;

import com.pattern.proxy.staticproxy.Son;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: zhaomengjie
 * @Date: 2020/5/11 21:30
 * @Version 1.0
 */
public class JDKProxy58 implements InvocationHandler {

    //需要被代理的对象
    private Son target;

    public Object getInstance(Son zhaomengjie){
        target = zhaomengjie;
        Class<?> clazz = target.getClass();
        //用来生成一个新的对象（字节码重组来实现）
        //这里的clazz.getInterfaces()就规定了必须实现一个接口
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);

    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("找工作");
        method.invoke(this.target,args);
        System.out.println("面试");
        return null;
    }
}
