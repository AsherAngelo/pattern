package com.pattern.tactic;

import com.pattern.tactic.payment.AliKey;
import com.pattern.tactic.payment.PayState;
import com.pattern.tactic.payment.PayType;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @Author: zhaomengjie
 * @Date: 2020/5/12 21:49
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        Order or = new Order("1","20200202001",200.12);
        //PayState payState = or.pay(new AliKey());
        //System.out.println(payState.toString());
        PayState payState = or.pay(PayType.JD_PEY);
        System.out.println(payState.toString());


        //这就是一个策略模式
         new ArrayList().sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });

         //spring中工厂的选择也是策略模式


    }
}
