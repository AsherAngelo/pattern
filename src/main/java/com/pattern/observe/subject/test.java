package com.pattern.observe.subject;

import com.pattern.observe.core.Event;

import java.lang.reflect.Method;

/**
 * @Author: zhaomengjie
 * @Date: 2020/5/16 23:57
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {

        try {
            Observer observer = new Observer();
            Method advice = Observer.class.getMethod("advice", new Class<?>[]{Event.class});
            Subject subject = new Subject();
            subject.addLisenter(SubjectEventEnum.ON_ADD, observer, advice);
            subject.add();

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
