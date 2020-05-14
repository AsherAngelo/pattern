package com.pattern.tactic.payment;

/**
 * @Author: zhaomengjie
 * @Date: 2020/5/12 21:53
 * @Version 1.0
 */
public class AliKey implements Payment{
    
    @Override
    public PayState payOperate(String uid,double memory) {
        return new PayState("200","阿里支付成功");
    }
}
