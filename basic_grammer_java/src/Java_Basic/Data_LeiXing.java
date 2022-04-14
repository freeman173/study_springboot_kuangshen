package Java_Basic;

public class Data_LeiXing {


/*
java里面有8种基本类型：
    char：char 数据类型可以储存任何字符；
    boolean：这种类型只作为一种标志来记录 true/false 情况；

    浮点型：
    double：大浮点型
    float：常规浮点型

    整数：
    long：大整数；
    int：常规整数；
    short：Short 数据类型也可以像 byte 那样节省空间。一个short变量是int型变量所占空间的二分之一；
    byte：byte 类型用在大型数组中节约空间，主要代替整数，因为 byte 变量占用的空间只有 int 类型的四分之一；


   引用数据类型： 在Java中，引用类型的变量非常类似于C/C++的指针。引用类型指向一个对象，指向对象的变量是引用变量。
这些变量在声明时被指定为一个特定的类型，比如 Employee、Puppy 等。变量一旦声明后，类型就不能被改变了。


java里面的变量类型：
    类变量：独立于方法之外的变量，用 static 修饰。
 无论一个类创建了多少个对象，类只拥有类变量的一份拷贝；静态变量在第一次被访问时创建，在程序结束时销毁；


    实例变量：独立于方法之外的变量，不过没有 static 修饰。
实例变量在对象创建的时候创建，在对象被销毁的时候销毁；


    局部变量：类的方法中的变量。
    局部变量声明在方法、构造方法或者语句块中；局部变量只在声明它的方法、构造方法或者语句块中可见；局部变量是在栈上分配的。





java的修饰符：
    private : 在同一类内可见。使用对象：变量、方法。
    protected : 对同一包内的类和所有子类可见。使用对象：变量、方法。
    public : 对所有类可见。使用对象：类、接口、变量、方法.

    父类中声明为 public 的方法在子类中也必须为 public。
    父类中声明为 protected 的方法在子类中要么声明为 protected，要么声明为 public，不能声明为 private。
    父类中声明为 private 的方法，不能够被子类继承。


    static 修饰符
        静态变量：
        static 关键字用来声明独立于对象的静态变量，无论一个类实例化多少对象，它的静态变量只有一份拷贝。 静态变量也被称为类变量。
        局部变量不能被声明为 static 变量。

        静态方法：
        static 关键字用来声明独立于对象的静态方法。静态方法不能使用类的非静态变量。静态方法从参数列表得到数据，然后计算这些数据。
        对类变量和方法的访问可以直接使用 classname.variablename 和 classname.methodname 的方式访问。

    final:
        final 变量：
            final 表示"最后的、最终的"含义，变量一旦赋值后，不能被重新赋值。被 final 修饰的实例变量必须显式指定初始值。
            final 修饰符通常和 static 修饰符一起使用来创建类常量。


        final 方法
            父类中的 final 方法可以被子类继承，但是不能被子类重写。
            声明 final 方法的主要目的是防止该方法的内容被修改。

        final 类
        final 类不能被继承，没有类能够继承 final 类的任何特性。

  abstract 修饰符
    抽象类：
        抽象类不能用来实例化对象，声明抽象类的唯一目的是为了将来对该类进行扩充。

   synchronized 修饰符
        synchronized 关键字声明的方法同一时间只能被一个线程访问。


transient 修饰符
    序列化的对象包含被 transient 修饰的实例变量时，java 虚拟机(JVM)跳过该特定的变量。
    该修饰符包含在定义变量的语句中，用来预处理类和变量的数据类型。


volatile 修饰符
volatile 修饰的成员变量在每次被线程访问时，都强制从共享内存中重新读取该成员变量的值。
而且，当成员变量发生变化时，会强制线程将变化值回写到共享内存。这样在任何时刻，两个不同的线程总是看到某个成员变量的同一个值。




 */

//    静态变量
    private static float salary;
//    静态常量
    public static final String Department="超哥";

    public void data_leixing(){

        salary=100000;
        System.out.println(Department+":"+salary);
    }

}
