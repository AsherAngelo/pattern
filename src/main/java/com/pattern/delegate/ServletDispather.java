package com.pattern.delegate;


import com.pattern.delegate.controllers.OrderController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhaomengjie
 * @Date: 2020/5/14 22:57
 * @Version 1.0
 * 相当于项目经角色
 */
public class ServletDispather {

    private List<Handler> handlerMapping = new ArrayList<>();

    private ServletDispather(){
        Class<?> classz = OrderController.class;
        Handler handler = new Handler();
        try {
            handler.setController(classz.newInstance());
            handler.setMethod(classz.getMethod("getOrderId",new Class[]{String.class}));
            handler.setUrl("/web/getMemberById");
        } catch (Exception e) {
            e.printStackTrace();
        }
        handlerMapping.add(handler);
    }


    public void doService(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        doDispather(httpServletRequest, httpServletResponse);
    }

    private void doDispather(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        //1获取用户请求的url
        String url = httpServletRequest.getRequestURL().toString();
        //按照j2ee标准，每个url一个请求servlet
        //2Servlet拿到url做选择，根据请求url去找url对应的某一个java类的方法
        //3通过url找类
        Handler handler1 = null;
        for(Handler handler:handlerMapping){
            if(url.equals(handler.getUrl())){
                handler1=handler;
                break;
            }
        }
        try {
            Object o = handler1.getMethod().invoke(handler1.getController(),httpServletRequest.getParameter("mid"));
            httpServletResponse.getWriter().write(o.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    class Handler {
        private Object controller;
        private Method method;
        private String url;

        public Object getController() {
            return controller;
        }

        public void setController(Object controller) {
            this.controller = controller;
        }

        public Method getMethod() {
            return method;
        }

        public void setMethod(Method method) {
            this.method = method;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
