package com.pattern.tactic.payment;

/**
 * @Author: zhaomengjie
 * @Date: 2020/5/12 22:00
 * @Version 1.0
 */
public enum  PayType {
    ALI_PAY(new AliKey()),
    JD_PEY(new JDKey());

    private Payment payment;
    PayType(Payment payment) {
        this.payment = payment;
    }
    public Payment get(){
        return this.payment;
    }
}
