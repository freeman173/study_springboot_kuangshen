package com.jc.annotation;


import java.lang.annotation.*;

/*

元注解的简单使用
 */
public class Test02 {

    @MyAnnotation
    public void test(){}

}

//注解只能放到于方法上
@Target(value = ElementType.METHOD)

//注解在什么时间段还有效
@Retention(value = RetentionPolicy.RUNTIME)

@Documented
@Inherited
@interface MyAnnotation{


}


