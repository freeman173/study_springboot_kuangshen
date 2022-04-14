package Java_Basic;


import java.util.Scanner;

/*
    通过 Scanner 类的 next() 与 nextLine() 方法获取输入的字符串，
在读取前我们一般需要 使用 hasNext 与 hasNextLine 判断是否还有输入的数据：



next() 与 nextLine() 区别：
 前者：
    1、一定要读取到有效字符后才可以结束输入。
    2、对输入有效字符之前遇到的空白，next() 方法会自动将其去掉。
    3、只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符。next() 不能得到带有空格的字符串。
 后者：
    1、以Enter为结束符,也就是说 nextLine()方法返回的是输入回车之前的所有字符。
    2、可以获得空白。



 */

public class ShuRu {

    public void shuru() {

//        //创建接受类并准备从键盘接收数据。
//        Scanner scan_1 = new Scanner(System.in);
//
//        // next方式接收字符串
//        System.out.println("next方式接收：");
//        // 判断是否还有输入
//        if (scan_1.hasNext()) {
//            String str1 = scan_1.next();
//            System.out.println("输入的数据为：" + str1);
//        }
////        关闭该对象
//        scan_1.close();


//        //创建接受类并准备从键盘接收数据。
//        Scanner scan_2 = new Scanner(System.in);
//
//        // next方式接收字符串
//        System.out.println("nextline方式接收：");
//        // 判断是否还有输入
//        if (scan_2.hasNextLine()) {
//            String str1 = scan_2.nextLine();
//            System.out.println("输入的数据为：" + str1);
//        }
////        关闭该对象
//        scan_2.close();


//        接收一个整数
        Scanner scan_3 = new Scanner(System.in);
        System.out.print("输入整数：");
        if (scan_3.hasNextInt()) {

            // 接收整数
            System.out.println("整数数据：" + scan_3.nextInt());


        }
    }
}
