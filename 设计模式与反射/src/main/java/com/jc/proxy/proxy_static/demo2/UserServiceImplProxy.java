package com.jc.proxy.proxy_static.demo2;


//代理业务角色
public class UserServiceImplProxy implements UserService{


//    将真实业务类（被代理）以组合的方式放进来。
    private UserServiceImpl userService;

    public UserServiceImplProxy() {
    }
    public UserServiceImplProxy(UserServiceImpl userService) {
        this.userService = userService;
    }

//    增加一些额外的功能

    public void log(String msg){
        System.out.println("使用了"+msg+"方法!");
    }



//    把被代理角色的业务全都实现
    @Override
    public void add(String name) {
        log("add");
        userService.add(name);
    }



    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void query() {
        log("query");
        userService.query();
    }



}
