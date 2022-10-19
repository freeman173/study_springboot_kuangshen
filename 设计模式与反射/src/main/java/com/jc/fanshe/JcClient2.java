package com.jc.fanshe;


import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class JcClient2 {



    public static void main(String[] jc) throws Exception {
    /*
        实现一个案例（框架的底层核心功能）：借助一个类信息的配置文件可以创建任意类的方法，可以执行任意方法。
     */



//      1、  加载配置文件（maven的配置放在resources下面即可）
        Properties pro=new Properties();
        ClassLoader classLoader= JcClient2.class.getClassLoader();
        InputStream inputStream=classLoader.getResourceAsStream("pro.properties");
        pro.load(inputStream);


//        2、获取到配置文件的配置信息
        String className= pro.getProperty("className");
        String methodName=pro.getProperty("methodName");


//            3、通过反射机制加载类进内存并创建对象
        Class cls=Class.forName(className);
//        反射机制中的无参构造创建实例对象
        Object object=cls.newInstance();


//        4、获取到方法对象并执行实例类的对应方法
        Method method=cls.getMethod(methodName);
        method.invoke(object);




        System.out.println("_____________________________________");





    }

}
