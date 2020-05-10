package com.pattern.factory.function;

import com.pattern.factory.simple.SimpleFactory;

/**
 * @Author: zhaomengjie
 * @Date: 2020/5/8 20:54
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        Factory mengNiuFactory = new MengNiuFactory();
        //产生问题用户需要配置，知道要哪个工厂，而且用户也不需要知道要哪个工厂不关心
        System.out.println(mengNiuFactory.getMilk());

    }
}
