//import com.jc.pojo.bean4.PersonTwo;

import com.jc.aop.UserService;
import com.jc.aop.UserServiceImpl;
import com.jc.aop.UserServiceThree;
import com.jc.aop.UserServiceTwo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class TestDemo {

    @Test
    public void TestOne(){

//      拿到ioc容器
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");

//        拿到对应类：动态代理代理一个接口（使用接口获取bean）
//        UserService userService = (UserService) applicationContext.getBean("userService");
//        userService.add();
//        userService.update();


//        UserServiceTwo userServiceTwo = (UserServiceTwo) applicationContext.getBean("userServiceTwo");
//        userServiceTwo.one();
//        userServiceTwo.two();

        UserServiceThree userServiceThree = (UserServiceThree) applicationContext.getBean("userServiceThree");
        userServiceThree.one();


        System.out.println("_______________");

    }

}
