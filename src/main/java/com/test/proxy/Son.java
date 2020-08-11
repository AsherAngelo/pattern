package com.test.proxy;

import com.pattern.factory.function.Factory;

/**
 * @Author: zhaomengjie
 * @Date: 2020/8/2 17:09
 * @Version 1.0
 */
public class Son implements Father {
    @Override
    public void buy() {
        System.out.println("买东西");
    }
}
