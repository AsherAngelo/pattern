package com.pattern.tactic.payment;

/**
 * @Author: zhaomengjie
 * @Date: 2020/5/12 21:49
 * @Version 1.0
 */
public class PayState {
    private String code;
    private String msg;
    private Object data;

    public PayState(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "PayState{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
