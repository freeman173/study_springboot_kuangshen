package Java_Basic.OBJECT;

import Java_Basic.OBJECT.Person;

public class Jc extends Person {
//    重写了父辈的方法！
    void eat(){
        System.out.println("我是超哥！！");
    }
    void eattest(){
//        调用自己的方法
        this.eat();
//        调用父类的方法
        super.eat();

    }

//    重载了两个test方法，按需调用！！
    public int test(int x){
        System.out.println("我是test1:"+x);
        return x;
    }

    public void test(){
        System.out.println("我是test2！！");
    }



}

