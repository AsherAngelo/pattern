package com.pattern.observe.subject;

import com.pattern.observe.core.Event;

/**
 * @Author: zhaomengjie
 * @Date: 2020/5/16 23:42
 * @Version 1.0
 */
public class Observer {
    public void advice(Event event){
        System.out.println("=====触发事件打印日志=====");
    }
}
