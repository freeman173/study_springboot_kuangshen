package com.example.demo3.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;


@Controller
public class LoginController {


    @RequestMapping("/login")
    public String index(@RequestParam("username") String userName, @RequestParam("passwd") String passwd, Model model, HttpSession session){

        if(userName.equals("jc") && passwd.equals("123456")){
//     向session中存放姓名属性
            session.setAttribute("loginUser",userName);
//            重定向：redirect又叫重定向，表示转发，当请求发给A服务时，服务A返回重定向给客户端，客户端再去请求B服务。
            return "redirect:/main";
        }
        model.addAttribute("msg","登录信息有误，麻烦重试哦！");
//forward又叫转发，表示转发，当请求来到时，可以将请求转发到其他的指定服务，用户端不知晓。
        return "index";
    }


}
