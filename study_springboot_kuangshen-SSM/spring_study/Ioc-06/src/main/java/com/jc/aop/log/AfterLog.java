package com.jc.aop.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;


//核心业务之后执行该方法
public class AfterLog implements AfterReturningAdvice {


/*
        returnvalue:返回值
 */
    @Override
    public void afterReturning(Object returnvalue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"的"+method.getName()+"的执行结果:"+returnvalue);
    }


}
