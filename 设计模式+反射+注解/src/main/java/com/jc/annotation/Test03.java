package com.jc.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*

自定义注解
 */
public class Test03 {

    @MyAnnotation2(name = "蒋超",age = 10)
    public void test(){

        System.out.println("");
    }


}


@Target({ElementType.ANNOTATION_TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2{
//    注解里面添加参数
    String name();
    int age() default 0;

    String[] schools() default {"cuit","cuitt"};


}
