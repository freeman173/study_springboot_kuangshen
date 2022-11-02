package com.jc.aop.diyAnnotation;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


//标记为切面类
@Aspect
@Component
public class AnnotationPointCut {


//    在这里定义一个切点
    @Pointcut("execution(* com.jc.aop.UserServiceImplThree.one())")
    public void pointCut(){}


//    直接在这里把增强功能织入切点
    @Before("pointCut()")
    public void before(){

        System.out.println("————方法执行前————");
    }




    @After("pointCut()")
    public void after(){

        System.out.println("————方法执行后————");
    }



//    环绕增强：调用目标方法之前与之后都执行一些特定功能。
    @Around("pointCut()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
//        环绕前的执行代码
        System.out.println("————环绕前——————");
//        执行目标方法并返回一个值
        Object result=joinPoint.proceed();
//        环绕后的执行代码
        System.out.println("————环绕后——————");

    }





}
