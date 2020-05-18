package com.pattern.observe.subject;

import com.pattern.observe.core.EventLisenter;

/**
 * @Author: zhaomengjie
 * @Date: 2020/5/16 23:41
 * @Version 1.0
 */
public class Subject extends EventLisenter {
    //通常采用动态代理监控，避免代码侵入
    public void add() {
        System.out.println("调用添加方法");
        trigger(SubjectEventEnum.ON_ADD);
    }

    public void remove() {
        System.out.println("调用删除方法");
    }
}
