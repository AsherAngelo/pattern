package com.pattern.decorate;

/**
 * @Author: zhaomengjie
 * @Date: 2020/5/16 22:45
 * @Version 1.0
 */
public class SignServiceNew implements ISignServiceNew{
    private ISignService signService;
    public SignServiceNew(ISignService iSignService) {
        signService=iSignService;
    }

    @Override
    public ResultMsg regist(String username, String password) {
        return signService.regist(username,password);
    }

    @Override
    public ResultMsg login(String username, String password) {
        return signService.login(username,password);
    }

    //下面可以扩展新的方法


}
