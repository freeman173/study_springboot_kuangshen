package Java_Basic;

/*
    在实际开发过程中，我们经常会遇到需要使用对象，而不是内置数据类型的情形。
    为了解决这个问题，Java 语言为每一个内置数据类型提供了对应的包装类。所有的包装类（Integer、Long、Byte、Double、Float、Short）
都是抽象类 Number 的子类。当 x 被赋为整型值时，由于x是一个对象，所以编译器要对x进行装箱。然后，为了使x能进行加运算，所以要对x进行拆箱。
注：以上过程都是编译器自动完成，我们不需要管！

    Java 的 Math 包含了用于执行基本数学运算的属性和方法，如初等指数、对数、平方根和三角函数。
Math 的方法都被定义为 static 形式，通过 Math 类可以在主函数中直接调用。


Number&Math中常用的方法：
xxxValue() 方法用于将 Number 对象转换为 xxx 数据类型的值并返回。
toString():将数据转化为字符串。



 */


public class Number {
    public static String getType(Object o){
        return o.getClass().toString(); //使用int类型的getClass()方法
    }

    public void number(){
        Integer y=5;
//        两者类型完全一致，由编译器自动完成。
        System.out.println(Number.getType(y));
        System.out.println(Number.getType(y.toString()));

//        调用math函数
        System.out.println("sin函数："+Math.sin(y));





    }

}
