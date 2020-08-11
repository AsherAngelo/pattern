package com.test.decorate;

/**
 * @Author: zhaomengjie
 * @Date: 2020/7/30 23:18
 * @Version 1.0
 */
public class TestServiceV2Impl implements TestServiceV2{

    private TestService testService;

    public void setTestService(TestService testService) {
        this.testService = testService;
    }

    @Override
    public void login(String username, String password) {
        testService.login(username,password);
    }

    @Override
    public void logout(String username) {
        System.out.println("增强");
    }
}
