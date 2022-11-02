//import com.jc.pojo.bean4.PersonTwo;
import com.jc.aop.UserServiceImpl;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

    @Test
    public void TestOne(){

//      拿到ioc容器
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");


        UserServiceImpl userService = (UserServiceImpl) applicationContext.getBean("userService");

        userService.add();







        System.out.println("_______________");

    }

}
