package com.test.tactic;

/**
 * @Author: zhaomengjie
 * @Date: 2020/8/2 16:51
 * @Version 1.0
 */
public class Order {
    public Double jine;
    public String uid;
    public void payMethod(PayEnum payEnum){
        payEnum.get().pay();
    }

    public Order(Double jine, String uid) {
        this.jine = jine;
        this.uid = uid;
    }
}
