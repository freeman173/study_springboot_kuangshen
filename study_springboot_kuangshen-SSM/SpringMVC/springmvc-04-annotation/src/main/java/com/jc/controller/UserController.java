package com.jc.controller;
import com.jc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserController {


    @GetMapping("/test1")
    /*
            @RequestParam用于将请求参数区数据映射到功能处理方法的参数上。
                将映射路径上的参数“name”映射到方法中的userName
     */
    public String test1(@RequestParam("name") String userName,Model model){

        model.addAttribute("userName",userName);
//        model.addAttribute("id",userName);

        return "one";
    }


    @GetMapping("/test2")
    /*
      在接收前端的参数时：
        假如要将前端参数映射为后端的对象，对象映射框架帮你做，但你必须得保证属性名一致才行。

     */
    public String test2(User user, Model model){

        model.addAttribute("user",user);
//        model.addAttribute("id",userName);

        return "one";
    }

}
