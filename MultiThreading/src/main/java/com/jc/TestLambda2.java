package com.jc;

public class TestLambda2 {

    public static void main(String[] args){

/*
Lambda表达式在Java语言中引入了一个操作符**“->”**，该操作符被称为Lambda操作符或箭头操作符。它将Lambda分为两个部分：
    左侧：指定了Lambda表达式需要的所有参数
    右侧：制定了Lambda体，即Lambda表达式要执行的功能。

 格式：
    (parameters) -> expression
    或
    (parameters) ->{ statements; }



 */
        ILove love=a -> System.out.println("I Love You"+a);



    }

}


interface ILove{
    void love(int a);
}
