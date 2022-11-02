import com.jc.pojo.Student;
import com.jc.pojo.Teacher;
import com.jc.pojo.bean3.Person;
//import com.jc.pojo.bean4.Person;
import com.jc.pojo.bean4.PersonTwo;
import com.jc.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

    @Test
    public void TestOne(){

//      拿到ioc容器
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");


        //        从容器中取所需对象
//        UserService userService= (UserService) applicationContext.getBean("userServiceImpl");
//        userService.getUser();
//
//
////        取出teacher对象
//        Teacher teacher= (Teacher) applicationContext.getBean("teacher");
//
////        取出student对象
//        Student student= (Student) applicationContext.getBean("student");
//
//
//        //        取出Person对象
//        Person person= (Person) applicationContext.getBean("person");
//        person.getCat().Shout();





//        使用注解自动获取person对象

        PersonTwo personTwo= (PersonTwo) applicationContext.getBean("person4");

        personTwo.getAnt().Shout();




        System.out.println("_______________");

    }

}
