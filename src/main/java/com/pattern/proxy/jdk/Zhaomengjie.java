package com.pattern.proxy.jdk;

import com.pattern.proxy.staticproxy.Son;

/**
 * @Author: zhaomengjie
 * @Date: 2020/5/11 21:29
 * @Version 1.0
 */
public class Zhaomengjie implements Son {
    public void findlove(){
        System.out.println("身高180");
    }

    @Override
    public void buy() {
        System.out.println("我要买东西");
    }

    @Override
    public void marry() {

    }

    @Override
    public void findLove() {

    }
}
