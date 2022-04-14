package com.example.spring_boot_demo1.dao;

import com.example.spring_boot_demo1.mapper.EmployeeMapper;
import com.example.spring_boot_demo1.pojo.Department;
import com.example.spring_boot_demo1.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository//声明该类是作用于持久层的
public class EmployeeDao {


//    private static Map<Integer, Employee> employees=null;


    @Autowired
    EmployeeMapper employeeMapper;

//    实现查询全部员工：OK
    public List<Employee> query_employees(){

        return employeeMapper.queryEmployeeList();
    }

//    查询单个员工:OK
    public Employee query_employeebyid(Integer id){
        return employeeMapper.queryEmploybyId(id);
    }



//    增加单个员工:ok
    public String add_employee(Employee employee){
        employeeMapper.addEmployee(employee);
        return "add_ok";
    }
//    更新单个员工:ok
    public String update_employee(Employee employee){
        employeeMapper.updateEmployee(employee);
        return "update_ok";
    }


//    删除单个员工:OK
    public String delete_employee(Integer id){
        employeeMapper.deleteEmployee(id);
        return "delete_ok";
    }












    //    当调用这个类时，该处会被优先加载
//    static {
//        employees=new HashMap<Integer,Employee>();
//        employees.put(1001,new Employee(1001,"AA","1669792108@qq.com",1,new Department(101,"教学部")));
//        employees.put(1002,new Employee(1002,"BB","1662108@qq.com",0,new Department(102,"市场部")));
//        employees.put(1003,new Employee(1003,"CC","19792108@qq.com",0,new Department(103,"后勤部")));
//        employees.put(1004,new Employee(1004,"DD","19792108@qq.com",0,new Department(104,"教研部")));
//        employees.put(1005,new Employee(1005,"EE","19792108@qq.com",1,new Department(105,"运营部")));
//    }
    //主键自增
//    private static Integer initid=1006;


//    //增加员工：写的填好了
//    public void save(Employee employee){
//        if(employee.getId()==null){
//            employee.setId(initid++);
//        }
//        employee.setDepartment(departmentDao.getdepartmentbyid(employee.getDepartment().getId()));
//        employees.put(employee.getId(),employee);
//
//    }
//
//    //查询员工信息
//    public Collection<Employee> getALL(){
//        return employees.values();
//    }
//
//    //通过id查询
//    public Employee getEmployByid(Integer id){
//        return employees.get(id);
//    }
//
//    //删除
//    public void delete(Integer id ){
//        employees.remove(id);
//    }


}
