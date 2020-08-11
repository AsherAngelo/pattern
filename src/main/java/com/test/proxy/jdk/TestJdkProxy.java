package com.test.proxy.jdk;

import com.test.proxy.Father;
import com.test.proxy.Son;

/**
 * @Author: zhaomengjie
 * @Date: 2020/8/2 17:09
 * @Version 1.0
 */
public class TestJdkProxy {
    public static void main(String[] args) {
        Father father = new Son();
        JdkProxy jdkProxy = new JdkProxy();
        Father father1 = (Father) jdkProxy.getInstance(father);
        father1.buy();
    }
}
