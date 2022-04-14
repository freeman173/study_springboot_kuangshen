package Java_Basic;



/*
在 Java 中字符串属于对象，Java 提供了 String 类来创建和操作字符串。
String 创建的字符串存储在公共池中，而 new 创建的字符串对象在堆上。
String 类是不可改变的，所以你一旦创建了 String 对象，那它的值就无法改变了。


当对字符串进行修改的时候，需要使用 StringBuffer。
在使用 StringBuffer 类时，每次都会对 StringBuffer 对象本身进行操作，而不是生成新的对象，所以如果需要对字符串进行修改推荐使用 StringBuffer。






 */
public class ZiFuCuan {

    public static void main(String args[]){
        String s1="我是超哥！！";
        String s2=new String("我是你爹！！");
        System.out.println(s1);

//        stringbuffer类的初始化！！
        StringBuffer sBuffer = new StringBuffer("菜鸟教程官网：");
        sBuffer.append("www");
        sBuffer.append(".runoob");
        sBuffer.append(".com");
        System.out.println(sBuffer);

        System.out.println("OK");




    }



















}
