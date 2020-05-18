package com.pattern.observe.core;

import java.lang.reflect.Method;

/**
 * @Author: zhaomengjie
 * @Date: 2020/5/16 23:43
 * @Version 1.0
 */
public class Event {
    //事件源
    private Object source;
    //通知目标
    private Object target;
    //回调
    private Method callback;
    //触发
    private String trigger;

    public Event(Object target,Method callback) {
        this.target = target;
        this.callback = callback;
    }

    public Object getSource() {
        return source;
    }

    public Object getTarget() {
        return target;
    }

    Event setTarget(Object target) {
        this.target = target;
        return this;
    }

    public Method getCallback() {
        return callback;
    }

    public void setCallback(Method callback) {
        this.callback = callback;
    }

    public String getTrigger() {
        return trigger;
    }

    void setSource(Object source) {
        this.source = source;
    }

    Event setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    @Override
    public String toString() {
        return "Event{" +
                "source=" + source +
                ", target=" + target +
                ", callback=" + callback +
                ", trigger='" + trigger + '\'' +
                '}';
    }
}
