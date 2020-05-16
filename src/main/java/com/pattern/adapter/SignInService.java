package com.pattern.adapter;

/**
 * @Author: zhaomengjie
 * @Date: 2020/5/14 23:30
 * @Version 1.0
 */
public class SignInService {
    /**
     * 注册方法
     */
    public ResultMsg regist(String username,String password){
        return new ResultMsg("200","注册成功",null);
    }

    /**
     * 登录方法
     */
    public ResultMsg login(String username,String password){
        return null;
    }


}
