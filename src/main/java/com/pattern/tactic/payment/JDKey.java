package com.pattern.tactic.payment;

/**
 * @Author: zhaomengjie
 * @Date: 2020/5/12 22:00
 * @Version 1.0
 */
public class JDKey implements Payment{

    @Override
    public PayState payOperate(String uid, double memory) {
        return new PayState("200","京东支付成功");
    }
}
