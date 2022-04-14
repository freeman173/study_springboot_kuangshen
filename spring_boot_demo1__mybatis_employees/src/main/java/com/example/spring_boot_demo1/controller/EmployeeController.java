package com.example.spring_boot_demo1.controller;


import com.example.spring_boot_demo1.dao.DepartmentDao;
import com.example.spring_boot_demo1.dao.EmployeeDao;
import com.example.spring_boot_demo1.pojo.Department;
import com.example.spring_boot_demo1.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.HashMap;


@Controller
public class EmployeeController {

    //将注解@Autowired 改为（@Autowired(required = false)）:找得到就注入，找不到就算了。
//    @Autowired(required = false)
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private DepartmentDao departmentDao;


    //又来bug：不能跳转到list页面，说是匹配不清晰，controller的配置都不能生效？
    @RequestMapping("/emps")
//    该动作OK了
    public String list(Model model){
//       bug： 显示这里的值为空?难受得很
// 解决：在EmployeeDao上面加入一个注解声明即可
        Collection<Employee> employees=employeeDao.query_employees();
        HashMap<Integer,String> departments=departmentDao.query_departments();

        model.addAttribute("emps",employees);
        model.addAttribute("departments",departments);
//        这里使用重定向用不了，直接使用路由路径就能用，搞不懂？
        return "/list.html";
    }




//    @GetMapping("/emp")//get请求
//    public String toAddpage(Model model){
//        //查询出部门的信息并返回到前端页面。
//        Collection<Department> departments=departmentDao.getdepartments();
//        model.addAttribute("departments",departments);
//        return "/emp/add";
//    }

//    //post请求一般用于表单提交数据
//    @PostMapping("/emp")//post请求
////    前端数据提交过来后，框架将其自动封装为了一个对象，我们负责接收就行。（具体原理我也不清楚，后面强化时再去了解）
//    public String addEmp( Employee employee){
////        保存数据
//
//        System.out.println("调试添加员工的信息："+employee);
//        employeeDao.save(employee);
////        跳回下面这个动作!!
//        return "redirect:/emps";
//    }
//
//
    @GetMapping("/update/{id}")//路径加用户的id
//    把用户的id拿到手
    public String toUpdateEmp(@PathVariable("id")Integer id,Model model){
//通过id拿到对应的数据,model会随着后面的路由传送到对应的页面
        Employee employee=employeeDao.query_employeebyid(id);
        model.addAttribute("emp",employee);
        HashMap<Integer,String> departments=departmentDao.query_departments();
        model.addAttribute("departments",departments);
//        页面跳转出问题了，明天来看！！
        return "/emp/update";


    }

//
//
//    @PostMapping("/updateEmp")//post请求
////    前端数据提交过来后，框架将其自动封装为了一个对象，我们负责接收就行。（具体原理我也不清楚，后面强化时再去了解）
//    public String updateEmp( Employee employee){
////        保存数据：因为前端把用户id一并传过来了，所以这里的save方法并不会新增用户，而是修改用户值！！
//        employeeDao.save(employee);
////        跳回下面这个动作!!
//        return "redirect:/emps";
//    }
//





//get请求一般用于超链接跳转
    @GetMapping("/delete/{id}")//路径加用户的id
//    把用户的id拿到手
    public String toDeleteEmp(@PathVariable("id")Integer id){

        System.out.println(id);
        employeeDao.delete_employee(id);
        return "redirect:/emps";

    }

}
