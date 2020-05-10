package com.pattern.singleton;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: zhaomengjie
 * @Date: 2020/5/8 23:02
 * @Version 1.0
 */

/**
 * 其实这里感觉还是会有线程安全的问题，很讨厌啊
 */
public class RegSingleton {
    //使用一个map来当注册表
    static private Map<String,Object> registry = new ConcurrentHashMap();

    //静态块，在类被加载时自动执行，把RegistSingleton自己也纳入容器管理
    static {
        RegSingleton rs = new RegSingleton();
        registry.put(rs.getClass().getName(), rs);
    }

    //受保护的默认构造函数，如果为继承关系，则可以调用，克服了单例类不能为继承的缺点
    protected RegSingleton() {
    }

    //静态工厂方法，返回此类的唯一实例
    public static RegSingleton getInstance(String name) {
        if (name == null) {
            name = "RegSingleton";
        }
        if (registry.get(name) == null) {
            //没有登记就进入同步块
            //这个是静态的所以就只能锁类了
            synchronized (RegSingleton.class){
                //再次检测是否登记
                if (!registry.containsKey(name)){
                    try {
                        //实例化对象
                        registry.put(name,Class.forName(name).newInstance());
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return (RegSingleton) registry.get(name);
    }
}
