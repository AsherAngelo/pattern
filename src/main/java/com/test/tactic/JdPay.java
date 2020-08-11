package com.test.tactic;

/**
 * @Author: zhaomengjie
 * @Date: 2020/8/2 16:52
 * @Version 1.0
 */
public class JdPay implements Pay{
    @Override
    public void pay() {
        System.out.println("京东支付");
    }
}
