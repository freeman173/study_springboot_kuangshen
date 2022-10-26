package com.jc.fanshe;

public class JcClient3 {


    public static void main(String[] JC){

        Class c1=Integer.class;


        int[] a=new int[10];
        int[] b=new int[100];

//        只要元素类型一致，就是同一个Class
        System.out.println(a.getClass().hashCode());
        System.out.println(b.getClass().hashCode());



        System.out.println("");

    }
}
