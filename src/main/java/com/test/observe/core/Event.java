package com.test.observe.core;

import java.lang.reflect.Method;

/**
 * @Author: zhaomengjie
 * @Date: 2020/8/1 23:20
 * @Version 1.0
 */
public class Event {
    private Object source;
    private Object target;
    private Method method;
    private String trigger;

    public Event(Object target, Method method) {
        this.target = target;
        this.method = method;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public String getTrigger() {
        return trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }
}
