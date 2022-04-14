package Java_Basic;

/*

finally 关键字用来创建在 try 代码块后面执行的代码块。
无论是否发生异常，finally 代码块中的代码总会被执行。
在 finally 代码块中，可以运行清理类型等收尾善后性质的语句。

finally 代码块出现在 catch 代码块之后

 */
public class YiChang {
    public void yichang() {

        int[] a = new int[2];
        try {

            System.out.println(a[2]);
        } catch (Exception e) {
//            打印错误信息！
            e.printStackTrace();
//            System.out.println(e);
        }finally {
            a[0]=1;
            System.out.println(a[0]);
        }


    }


    }


