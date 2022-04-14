package Java_Basic.OBJECT;

import Java_Basic.INTERFACE.Animal_Behavior;

public class Dog extends Animal implements Animal_Behavior {
    public void work(){
        System.out.println("我是狗，我要看家！！");
    }

    @Override
    public void eat() {
        System.out.println("我是狗，我喜欢吃骨头！！");
    }

    @Override
    public void travel() {
        System.out.println("我是狗，我不喜欢旅行！！");
    }
}
