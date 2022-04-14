package com.example.springboot5_springboot_shiro.controller;


import org.apache.catalina.security.SecurityUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @GetMapping({"/","/index"})
    public String totest(Model model){
        model.addAttribute("msg","shiro是一个安全框架");
        return "index";
    }

    @GetMapping({"/user/add"})
    public String toadd(){

        return "user/add";
    }

    @GetMapping({"/user/update"})
    public String totest(){

        return "user/update";
    }

//    跳到登录页面
    @GetMapping("/tologin")
    public String tologin(){
        return "login";
    }


/*
心得：
    用户信息提交过来后，shiro框架会利用它的工具将其拿到config/UserRealm的认证功能下去做认证。
    感觉毫无关联，但是框架的看不见的原理的部分已经将两者结合在一起了，这个后面有兴趣再做了解。

 */

    @GetMapping("/login")
    public String login(String username,String password,Model model) {

//        获取当前用户
        Subject subject = SecurityUtils.getSubject();
//封装用户的登录数据
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        try {
//           如果一切正常进行，就跳到首页！
            subject.login(token);
            return "index";
        } catch (UnknownAccountException e) {
            model.addAttribute("msg", "用户名错误！！");
            return "login";
        } catch (IncorrectCredentialsException e) {
            model.addAttribute("msg", "密码错误！！");
            return "login";
        }

    }

    @RequestMapping("/noauth")
    @ResponseBody
    public String unauthorized(){

        return "未经授权无法访问此页面！！";
    }



}
