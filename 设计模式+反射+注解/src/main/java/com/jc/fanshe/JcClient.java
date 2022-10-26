package com.jc.fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;



public class JcClient {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {





/*
开发人员在编写java代码完毕之后，idea会通过“javac”将.java文件自动转化为.class文件；
 */
//        来个实例对象
        Student student=new Student();


//通过以下方式将Student对象的.class文件加载进内存并返回一个Class对象：
        Class stuClass=Class.forName("com.jc.fanshe.Student");


/*

访问Class对象中的对象属性部分

 */
////      “.getDeclaredFields()”可以访问对象私有属性所对应的“封装对象”
//        Field[] fields=stuClass.getDeclaredFields();
//        for(Field field:fields){
//            System.out.println(field);
//        }
//
////        得到name对应的“封装对象”
//        Field name=stuClass.getField("name");
////        暴力反射：可以访问私有变量
//        name.setAccessible(true);
////        通过name“封装对象”得到传入实例对象的私有属性
//        Object object=name.get(student);


        /*
            访问Class对象中的对象构造部分
         */
//        得到带参构造器（String.class为对象属性参数的类型）
//        Constructor constructor=stuClass.getConstructor(String.class,Integer.class);
//        Object object=constructor.newInstance("蒋超",24);



   /*
            访问Class对象中的对象方法部分

         */

//        得到方法部分的字节码映射对象
        Method method=stuClass.getMethod("setName", String.class);

//        执行该方法（需要传入方法所需参数）
        method.invoke(student,"蒋超");












        System.out.println("________________________");

    }

}
