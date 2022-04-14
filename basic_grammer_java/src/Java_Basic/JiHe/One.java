package Java_Basic.JiHe;

import java.util.*;

public class One {
    public static void main(String[] args){
//        List<String> list=new ArrayList<String>();
//        list.add("我是超哥！！");
//        list.add("我是刘琪！！");
//        list.add("我是经辉！！");
//        list.add("我是刘涛");
//
////        迭代器遍历列表
//        Iterator<String> ite=list.iterator();
//        while (ite.hasNext()){
//            System.out.println(ite.next());
//        }
//        Map<String,String> map=new HashMap<String,String>();
//        map.put("1","超哥");
//        map.put("2","刘琪");
//        map.put("3","谢景辉");
//        map.put("4","刘涛");
//        map.put("5","省政令");
//        map.put("6","谭思军");
//        System.out.println("遍历map");
//        for(Map.Entry<String,String>entry:map.entrySet()){
//
//            System.out.println("key:"+entry.getKey()+" and value:"+entry.getValue());
//        }

        One.jc();

        System.out.println("OK");

    }

//    声明一个泛型方法
    public static <E> void printarray(E[] inputarray){

        System.out.println("________________");
        for (E element:inputarray){
            System.out.println(element);

        }

    }

    public static void jc(){
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        printarray(intArray);
        printarray(doubleArray);
        printarray(charArray);


    }







//    ArrayList 类是一个可以动态修改的数组，与普通数组的区别就是它是没有固定大小的限制，我们可以添加或删除元素。
    public static void arraylist_demo(){

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(100);
        myNumbers.add(150);
        myNumbers.add(20);
        myNumbers.add(21);
        myNumbers.add(1);
        myNumbers.add(5);
        myNumbers.add(6);
        myNumbers.add(778);

//        排序操作：Collections中定義了一些框架數據結構的常用方法，必要時可以拿來用！
        Collections.sort(myNumbers);
        System.out.println(myNumbers);


    }

//    ava LinkedList（链表） 类似于 ArrayList，是一种常用的数据容器。
//
//与 ArrayList 相比，LinkedList 的增加和删除的操作效率更高，而查找和修改的操作效率较低。
    public static void linklist_demo() {
        LinkedList<String> sites = new LinkedList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        // 使用 addFirst() 在头部添加元素
        sites.addFirst("Wiki");
        sites.add("超哥");
        sites.add("tom");
        sites.add("Taobao");

        System.out.println("排序前："+sites);
        Collections.sort(sites);
        System.out.println("排序後："+sites);


    }

//HashMap 是一个散列表，它存储的内容是键值对(key-value)映射。
//HashMap 是无序的，即不会记录插入的顺序。
    public static void hashmap_demo(){

        HashMap<Integer,String> A=new HashMap<Integer,String>();
        // 添加键值对
        A.put(1, "Google");
        A.put(2, "Runoob");
        A.put(3, "Taobao");
        A.put(4, "Zhihu");
//        遍历
        for(Integer i:A.keySet()){
            System.out.println("key:"+i+"  value:"+A.get(i));
        }





    }

//    Java Iterator（迭代器）不是一个集合，它是一种用于访问集合的方法，可用于迭代 ArrayList 和 HashSet 等集合。
//调用 it.next() 会返回迭代器的下一个元素，并且更新迭代器的状态。
//调用 it.hasNext() 用于检测集合中是否还有元素。
//调用 it.remove() 将迭代器返回的元素删除。（集合中也不会有此元素）

    public static void iterator_demo(){
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        numbers.add(12);numbers.add(4);numbers.add(7);numbers.add(117);numbers.add(12);
        Iterator<Integer> it =numbers.iterator();
        while(it.hasNext()){
            Integer i=it.next();
            if(i<10){
                it.remove();
            }


        }
        System.out.println(numbers);
    }



}
