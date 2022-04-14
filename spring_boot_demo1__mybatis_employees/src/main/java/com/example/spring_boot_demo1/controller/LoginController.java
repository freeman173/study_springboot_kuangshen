package com.example.spring_boot_demo1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;


@Controller//controller:就是一次行动。前端页面数据绑定到该次行动，该次行动做出对应响应即可，
public class LoginController {
    @RequestMapping("/login")
//    @ResponseBody,让下面的函数返回一个响应体，“index”就只能是普通的字符串。
//    从浏览器端接受参数
    public String login(@RequestParam("username") String username,
                        @RequestParam("passwd") String passwd,
                        Model model, HttpSession session) {

//        用户名与密码名不为空
        if (!StringUtils.isEmpty(username)&&"123456".equals(passwd)){
//            登录成功之后设置好session
            session.setAttribute("loginUser",username);
//            这里使用直接路由用不了，但使用重定向能用，搞不懂
            return "redirect:/main.html";
        }else {
//            这里的msg将会传到index页面。
            model.addAttribute("msg","请重新输入哦！！");
            return "redirect:/index.html";
        }


    }


    @GetMapping("/logout")
//    将session参数接受过来
    public String logout(HttpSession session){
//        注销session并跳转到登录页面！！
        session.invalidate();
        return "redirect:/index.html";


    }





}
