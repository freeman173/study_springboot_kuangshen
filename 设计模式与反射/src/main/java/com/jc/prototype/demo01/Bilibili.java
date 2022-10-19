package com.jc.prototype.demo01;


import java.util.Date;

/*

克隆

 */
public class Bilibili {
   public static void main(String[] args) throws CloneNotSupportedException {

//      原型对象
      Date date=new Date();
      Video v1=new Video("超人说java",date);

      System.out.println("v1: "+v1);
//      如果两个对象相同，那么它们的hashCode值一定要相同
      System.out.println("v1: "+v1.hashCode());

//克隆对象
      Video v2=(Video) v1.clone();
      v2.setName("刘琪说java");
      System.out.println("v2: "+v2);
//      如果两个对象相同，那么它们的hashCode值一定要相同
      System.out.println("v2: "+v2.hashCode());


      System.out.println("___________________________________");

   }

}
