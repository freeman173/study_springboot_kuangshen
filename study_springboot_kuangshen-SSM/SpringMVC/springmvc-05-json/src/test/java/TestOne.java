import com.fasterxml.jackson.core.JsonProcessingException;
import com.jc.controller.UserController;
import org.junit.Test;

public class TestOne {


    @Test
    public void test1() throws JsonProcessingException {
        UserController userController=new UserController();

//        userController.json1();
//        userController.json2();
        userController.json3();
        System.out.println("____END______");






    }
}
