package com.test.observe.core;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zhaomengjie
 * @Date: 2020/8/1 23:19
 * @Version 1.0
 */
public class EventListener {
    protected Map<Enum, Event> map = new HashMap<>();

    public void addListener(Enum eventType, Object source, Method method) {
        map.put(eventType, new Event(source, method));
    }

    private void trigger(Event event){
        event.setSource(this);
        try {
            event.getMethod().invoke(event.getTarget(),event);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    protected void trigger(Enum enumType){
        if(!map.containsKey(enumType)){
            return;
        }
        Event e = map.get(enumType);
        e.setTrigger(enumType.toString());
        trigger(e);
    }

}
