package com.pattern.decorate;


/**
 * @Author: zhaomengjie
 * @Date: 2020/5/16 22:43
 * @Version 1.0
 */
public interface ISignService {
    /**
     * 注册方法
     */
    public ResultMsg regist(String username, String password);
    /**
     * 登录方法
     */
    public ResultMsg login(String username, String password);
}
