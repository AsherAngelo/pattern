package com.pattern.decorate;

/**
 * @Author: zhaomengjie
 * @Date: 2020/5/16 22:44
 * @Version 1.0
 */
public class SignService implements ISignService{
    /**
     * 注册方法
     */
    @Override
    public ResultMsg regist(String username, String password){
        return new ResultMsg("200","注册成功",null);
    }

    /**
     * 登录方法
     */
    @Override
    public ResultMsg login(String username, String password){
        return null;
    }
}
