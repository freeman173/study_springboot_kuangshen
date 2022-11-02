package com.jc.aop.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;




//核心业务之前执行该方法
public class Log implements MethodBeforeAdvice {


    /*
        target:目标对象
        method:被增强的目标对象方法
        args:参数
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {

        System.out.println(target.getClass().getName()+"的"+method.getName()+"被执行了");

    }
}
