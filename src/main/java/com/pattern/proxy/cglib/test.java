package com.pattern.proxy.cglib;

import java.io.ObjectInputStream;

/**
 * @Author: zhaomengjie
 * @Date: 2020/5/11 22:02
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        Zhangsan o = (Zhangsan)new Cglibmeipo().getInstance(Zhangsan.class);
        o.findLove();
        System.out.println(o.getClass());
    }
}
