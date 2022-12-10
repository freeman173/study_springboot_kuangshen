package com.example.demo3.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*

自定义一个拦截器

 */
public class LoginHandlerIntercepter implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        Object loginUserName=request.getSession().getAttribute("loginUser");
        System.out.println("____test_____");
//        未登录验证
        if(loginUserName==null){
            request.setAttribute("msg","还未登录");
            request.getRequestDispatcher("/index").forward(request,response);
            return false;
        }
//        放行
        return true;
    }
}
