import com.jc.config.JcConfig;
import com.jc.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sun.usagetracker.UsageTrackerClient;

public class TestOne {

    @Test
    public void testOne(){

//        读取配置类
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(JcConfig.class);


//        从配置类中取出相应bean
        User user= (User) applicationContext.getBean("getUser");

        System.out.println("______________");

    }
}
