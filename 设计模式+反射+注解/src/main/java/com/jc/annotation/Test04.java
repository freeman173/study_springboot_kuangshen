package com.jc.annotation;


import java.lang.annotation.*;
import java.lang.reflect.Field;

/*

利用反射获取注解中的元数据
 */
public class Test04 {

    public static void main(String[] JC) throws Exception {

        Class c1=Class.forName("com.jc.annotation.Student");


//        获取到该类上面的注解
        Annotation[] annotations=c1.getAnnotations();


//        获取类注解的值
        TableKuang tableKuang=(TableKuang)c1.getAnnotation(TableKuang.class);


//        获取属性的注解值
        Field field= c1.getDeclaredField("id");
        FieldKuang fieldKuang=field.getAnnotation(FieldKuang.class);




        System.out.println("_____________");
    }


}


@TableKuang("db_student")
class Student{

    @FieldKuang(columnName = "db_id",type = "int" ,length = 10)
    private int id;
    @FieldKuang(columnName = "db_age",type = "int" ,length = 10)
    private int age;
    @FieldKuang(columnName = "db_name",type = "varchar" ,length = 10)
    private String name;

    public Student() {
    }

    public Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



//来一个类名注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface TableKuang{
    String value();
}

//来一个属性注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface FieldKuang{
    String columnName();
    String type();
    int length();

}




