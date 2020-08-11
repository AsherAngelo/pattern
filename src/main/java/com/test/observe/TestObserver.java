package com.test.observe;

import com.test.observe.core.Event;
import com.test.observe.core.EventEnum;

import java.lang.reflect.Method;

/**
 * @Author: zhaomengjie
 * @Date: 2020/8/1 23:34
 * @Version 1.0
 */
public class TestObserver {
    public static void main(String[] args) throws NoSuchMethodException {
       Observer observer = new Observer();
       Method method = Observer.class.getMethod("trr",new Class[]{Event.class});
       Subject subject = new Subject();
       subject.addListener(EventEnum.ENUM_ADD,observer,method);
       subject.add();
        //System.out.println(123);
    }
}
