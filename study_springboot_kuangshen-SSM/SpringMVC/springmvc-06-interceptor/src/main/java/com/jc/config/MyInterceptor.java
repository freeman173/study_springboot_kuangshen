package com.jc.config;

import com.jc.pojo.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


//自定义拦截器
public class MyInterceptor implements HandlerInterceptor {

    /*
        return true:执下一个拦截器，放行
        return false:拦住了，请求进不来
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        HttpSession session=request.getSession();

        System.out.println("_________处理前_________");

//        判断什么情况下可以放行
//        session中的用户名不为空就可以放行
        User user= (User) session.getAttribute("user");
        if(user.getUsername()!=null){
            return true;
        }


//        跳转到登录页面
        request.getRequestDispatcher("/user/login").forward(request,response);


        return false;
//        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("_________处理后_________");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("_________扫尾清理工作_________");
    }
}
