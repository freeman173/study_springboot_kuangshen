package com.jc;


/*

推导lambda表达式

 */
public class TestLambda1 {

//    静态内部类
    static class Like2 implements Ilike{

        public void lambda() {
            System.out.println("i like lambda2");
        }
    }



    public static void main(String[] jc){

        //        通过实现类调用接口
        Ilike ilike=new Like();
        ilike.lambda();

        //        通过静态内部类调用接口
         ilike=new Like2();
         ilike.lambda();

//3、局部内部类
        class Like3 implements Ilike{
            public void lambda() {
                System.out.println("i like lambda3");
            }
        }
        //        通过局部内部类调用接口
        ilike=new Like3();
        ilike.lambda();

        //4、借助匿名内部类（无类的名称，必须借助接口或者父类实现）
        ilike=new Ilike() {
            public void lambda() {
                System.out.println("i like lambda4");
            }
        };
        ilike.lambda();

//        5、用lambda表达式;使用前提：函数式接口（只包含一个抽象方法的接口）
        ilike=()->{
            System.out.println("i like lambda5");
        };
        ilike.lambda();






    }
}



//1、定义一个函数接口
interface Ilike{
    void lambda();
}

//2、实现类
class Like implements Ilike{


    public void lambda() {
        System.out.println("i like lambda1");
    }
}



