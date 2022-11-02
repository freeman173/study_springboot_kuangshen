package com.jc.controller;


import com.jc.pojo.Book;
import com.jc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    @Qualifier("bookserviceimpl")
    private BookService bookService;

    @RequestMapping("/allBooks")
    public String list(Model model){
        List<Book>  bookList=bookService.selectAllBooks(null);
        model.addAttribute("list",bookList);

        return "allBooks";
    }

//    跳转到增加书籍页面
    @RequestMapping("/toAddBook")
    public String toAddBook(){
        return "addBook";
    }

//    添加书籍的请求
    @PostMapping("/addBook")
    public String addBook(Book book){

        bookService.addBook(book);

        return "redirect:/allBooks";
    }

//    跳转到修改页面:
    @GetMapping("/toUpdateBook/{id}")
    public String toUpdateBook(@PathVariable("id") Integer id, Model model ){

        Book book=bookService.selectBookById(id);
        model.addAttribute("book",book);

        return "updateBook";
}


    //    修改书籍的请求
    @PostMapping("/updateBook")
    public String updateBook(Book book){

        bookService.updateBook(book);
        return "redirect:/allBooks";
    }


    //    执行删除功能:
    @GetMapping("/toDeleteBook/{id}")
    public String toUpdateBook(@PathVariable("id") Integer id){


       bookService.deleteBookById(id);

       return "redirect:/allBooks";

    }


    //    查询书籍的请求
    @PostMapping("/queryBook")
    public String queryBook(String bookName,Model model){

//        如果无查询数据，则默认查询全部即可
        if(bookName.length()==0)
        {
            return "redirect:/allBooks";
        }

        List<Book> bookList= bookService.selectAllBooks(bookName);
        model.addAttribute("list",bookList);
        return "allBooks";
    }






}
