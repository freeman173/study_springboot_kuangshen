package com.jc.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
//       创建模型视图类
        ModelAndView modelAndView=new ModelAndView();
//       封装数据
        modelAndView.addObject("msg","我是超人！");
//        设置跳转视图
        modelAndView.setViewName("one");//:/WEB-INF/jsp/hello.jsp

//        返回数据到
        return modelAndView;

    }
}
