package com.pattern.tactic.payment;

/**
 * @Author: zhaomengjie
 * @Date: 2020/5/12 21:15
 * @Version 1.0
 */
public interface Payment {
    PayState payOperate(String uid,double memory);
}
