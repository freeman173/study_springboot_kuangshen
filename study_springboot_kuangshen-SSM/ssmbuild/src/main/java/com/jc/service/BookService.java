package com.jc.service;

import com.jc.pojo.Book;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;


//服务层bean
@Service
public interface BookService {

    //    增加一本书
    Integer addBook(Book book);
    //    删除一本书
    Integer deleteBookById( Integer id);
    //    更新一本书
    Integer updateBook(Book book);
    //    查询一本书
    Book selectBookById( Integer id);
    //    查询全部的书
    List<Book> selectAllBooks(String bookName);



}
