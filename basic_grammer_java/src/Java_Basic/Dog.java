package Java_Basic;

public class Dog {
    public  int dogage;
    public  String dogname;

//    构造函数：当类里没有显式地定义代码来实现任何构造函数时，Java编译器将会在编译的字节码(.class文件)里面为这个类插入默认构造函数。
//    默认构造函数方法体为空

    public Dog(String name){
        this.dogname=name;
        System.out.println("狗的名字:"+name);
    }

    public void setDogage(int dogage) {
        this.dogage = dogage;
    }
    public int getDogage() {
        return dogage;
    }

    public String getDogname() {
        return dogname;
    }
}
