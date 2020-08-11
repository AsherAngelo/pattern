package com.test.observe;

import com.test.observe.core.EventEnum;
import com.test.observe.core.EventListener;

/**
 * @Author: zhaomengjie
 * @Date: 2020/8/1 23:31
 * @Version 1.0
 */
public class Subject extends EventListener {
    public void add(){
        System.out.println("主动add");
        trigger(EventEnum.ENUM_ADD);
    }
}
