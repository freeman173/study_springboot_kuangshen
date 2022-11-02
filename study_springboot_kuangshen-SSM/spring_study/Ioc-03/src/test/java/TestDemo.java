//import com.jc.pojo.bean4.PersonTwo;
import jc.pojo.Teacher;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

    @Test
    public void TestOne(){

//      拿到ioc容器
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");


//        使用注解自动获取teacher对象
        Teacher teacher= (Teacher) applicationContext.getBean("jcc");







        System.out.println("_______________");

    }

}
