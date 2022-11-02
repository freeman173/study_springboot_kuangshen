import com.jc.controller.BookController;
import com.jc.dao.BookMapper;
import com.jc.service.BookService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {




    @Test
    public void testOne(){

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-application.xml");

//        BookService bookService= (BookService) applicationContext.getBean("bookserviceimpl");
//
//        Object result=bookService.selectAllBooks();
        BookMapper bookService= (BookMapper) applicationContext.getBean("bookMapper");
        Object result=bookService.selectAllBooks(null);
        System.out.println("____________END_________");

    }

}
