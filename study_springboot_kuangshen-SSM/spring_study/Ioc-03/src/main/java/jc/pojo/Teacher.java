package jc.pojo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



//将该类注入到ioc容器中，等价于 <bean id="……" class="………………………………………………"/>
@Component("jcc")//该类的一个beanid
@Scope("singleton")
public class Teacher {

//    给属性注入值： <property name="name" value="蒋超"/>
    @Value("蒋超")
    private String name;
    private int age;



}
