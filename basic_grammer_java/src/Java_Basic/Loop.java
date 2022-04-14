package Java_Basic;

public class Loop {

    public void loop() {
        System.out.println("while循环：");
        int x = 5;
        while (x < 10) {
//           println： 换行打印
            System.out.println(x);
            x++;

            System.out.println("for循环：");
            for (int i = 10; i < 20; i++) {
                System.out.println(i);
            }

            System.out.println("加强版or循环：");
            String[] names = {"James", "Larry", "Tom", "Lacy"};
            for (String j : names) {
                System.out.println(j);
            }
//break 跳出当前（平级）所在逻辑判断（循环……）
            System.out.println("break的使用：");
            int[] numbers={1,2,3,4,5};
            for(int j:numbers) {
                if (j == 4)
                    break;
                System.out.println(j);
            }
//continue 跳出当前当次逻辑判断结果，并执行本循环中的下一次
            System.out.println("continue的使用：");
            int[] numberss={1,2,3,4,5};
            for(int j:numberss) {
                if (j == 4)
                    continue;
                System.out.println(j);
            }
    }
    }
}
