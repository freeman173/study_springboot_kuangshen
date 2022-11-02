package com.jc.controller;


import com.jc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class LoginController {

    @GetMapping("/main")
    public String toMain(){

        return "main";
    }

    @GetMapping("/toLogin")
    public String toLogin(){

        return "login";
    }


    @PostMapping("/login")
    public String login(HttpSession session, User user, Model model){

        session.setAttribute("user",user);
        model.addAttribute("username",user.getUsername());
        return "main";
    }

    @GetMapping("/loginout")
    public String loginout(HttpSession session){

        session.removeAttribute("username");

        return "forward:/user/main";
    }


}