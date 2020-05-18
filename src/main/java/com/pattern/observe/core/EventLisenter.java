package com.pattern.observe.core;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zhaomengjie
 * @Date: 2020/5/16 23:47
 * @Version 1.0
 */
public class EventLisenter {
    protected Map<Enum, Event> event = new HashMap<Enum, Event>();

    public void addLisenter(Enum eventType, Object target, Method method) {
        //注册事件
        //用反射调用方法
        event.put(eventType,new Event(target,method));
    }

    private void trigger(Event e){
        e.setSource(this);
        try {
            e.getCallback().invoke(e.getTarget(),e);
        } catch (IllegalAccessException e1) {
            e1.printStackTrace();
        } catch (InvocationTargetException e1) {
            e1.printStackTrace();
        }
    }

    protected void trigger(Enum call){
        if(!this.event.containsKey(call)){return;}
        trigger(this.event.get(call).setTrigger(call.toString()));
    }

}
