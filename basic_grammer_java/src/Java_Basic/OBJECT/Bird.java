package Java_Basic.OBJECT;

import Java_Basic.INTERFACE.Animal_Behavior;

public class Bird implements Animal_Behavior {
    public void getname(){
        System.out.println("我是一只小小鸟！！");
    }
    @Override
    public void eat() {
        System.out.println("我喜欢吃虫子！！");

    }

    @Override
    public void travel() {
        System.out.println("我想要飞到美国去！！");
    }
}
