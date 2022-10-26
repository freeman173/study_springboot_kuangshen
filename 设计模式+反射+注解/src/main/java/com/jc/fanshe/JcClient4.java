package com.jc.fanshe;


import java.lang.reflect.Method;

/*

性能测试：
    普通方法跟反射方法做对比
 */
public class JcClient4 {

//    普通方法调用
    public static void test01(){

        Student student=new Student();

        long startTime=System.currentTimeMillis();
        for (int i=0;i<1000000000;i++){

           student.getName();

        }
        long endTime=System.currentTimeMillis();

        System.out.println("普通方式花费时间："+(endTime-startTime)+"ms");


    }

    //    反射方法调用
    public static void test02() throws Exception {

        Student student=new Student();
        Class c1=student.getClass();


        Method getName=c1.getMethod("getName");
        getName.setAccessible(false);


        long startTime=System.currentTimeMillis();
        for (int i=0;i<1000000000;i++){

            getName.invoke(student);

        }
        long endTime=System.currentTimeMillis();

        System.out.println("反射方式花费时间："+(endTime-startTime)+"ms");


    }

    //    反射方法调用（关闭权限检测）
    public static void test03() throws Exception {

        Student student=new Student();
        Class c1=student.getClass();


        Method getName=c1.getMethod("getName");
        getName.setAccessible(true);


        long startTime=System.currentTimeMillis();
        for (int i=0;i<1000000000;i++){

            getName.invoke(student);

        }
        long endTime=System.currentTimeMillis();

        System.out.println("反射方式(关闭权限检测)花费时间："+(endTime-startTime)+"ms");


    }




    public static void main(String[] D) throws Exception {

        JcClient4.test01();
        JcClient4.test02();
        JcClient4.test03();

    }



}
