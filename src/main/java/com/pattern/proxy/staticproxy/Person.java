package com.pattern.proxy.staticproxy;

/**
 * @Author: zhaomengjie
 * @Date: 2020/5/11 21:16
 * @Version 1.0
 */
public class Person implements Son {
    @Override
    public void findLove(){
        System.out.println("找媳妇");
    }

    @Override
    public void buy() {

    }

    @Override
    public void marry() {

    }
}
