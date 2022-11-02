import com.jc.dao.impl.UserMysqlImpl;
import com.jc.service.UserService;
import com.jc.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;


public class TestFunction {


    @Test
    public void function(){

        UserService userService=new UserServiceImpl();
//        强制向下转型：向下造型，需要用到强制类型转换。
        ((UserServiceImpl) userService).setUserDao(new UserMysqlImpl());

        userService.getUser();


        System.out.println("______________________END______________________");
    }

}
