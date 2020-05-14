package com.pattern.tactic;

import com.pattern.tactic.payment.PayState;
import com.pattern.tactic.payment.PayType;
import com.pattern.tactic.payment.Payment;

/**
 * @Author: zhaomengjie
 * @Date: 2020/5/12 21:13
 * @Version 1.0
 */
public class Order {
    private String uid;
    private String orderId;
    private double amount;

    public Order(String uid, String orderId, double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }
//
//    public PayState pay(Payment payment){
//        return payment.payOperate(uid,amount);
//    }


    public PayState pay(PayType payType){
        return payType.get().payOperate(uid,amount);
    }

}
