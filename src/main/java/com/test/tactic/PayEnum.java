package com.test.tactic;

/**
 * @Author: zhaomengjie
 * @Date: 2020/8/2 16:50
 * @Version 1.0
 */
public enum PayEnum {
    JD_PAY(new JdPay()),ZFB_PAY(new ZfbPay());
    private Pay pay;

    PayEnum(Pay pay) {
        this.pay = pay;
    }

    public Pay get(){
        return this.pay;
    }
}
