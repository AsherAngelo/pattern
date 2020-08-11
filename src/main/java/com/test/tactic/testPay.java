package com.test.tactic;

/**
 * @Author: zhaomengjie
 * @Date: 2020/8/2 16:56
 * @Version 1.0
 */
public class testPay {
    public static void main(String[] args) {
        Order order = new Order(21.1,"zhaomengjie");
        order.payMethod(PayEnum.JD_PAY);
    }
}
