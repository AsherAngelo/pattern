package com.test.proxy.cglib;

import com.test.proxy.Son;

/**
 * @Author: zhaomengjie
 * @Date: 2020/8/2 17:19
 * @Version 1.0
 */
public class TestCglib {
    public static void main(String[] args) {
        Son cg = (Son)new CglibProxy().getInstance(Son.class);
        cg.buy();
    }
}
