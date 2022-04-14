package com.example.spring_boot_demo1.config;


import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//登录的拦截器：只有登录成功，才可以访问内部页面！！
public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        Object loginUser=request.getSession().getAttribute("loginUser");
        if(loginUser==null){
            request.setAttribute("msg","无权限，请先登录");
//            跳转页面到首页
//            这里的bug调试了50分钟：项目指定这一行有错误，我就把重定向语句换了一下，结果就行了。
            request.getRequestDispatcher("/index.html").forward(request,response);
//            response.sendRedirect("/index.html");
            return false;
        }else {
            return true;
        }

    }
}
