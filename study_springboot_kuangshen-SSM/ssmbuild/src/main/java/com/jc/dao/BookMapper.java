package com.jc.dao;

import com.jc.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;



public interface BookMapper {

//    增加一本书
    Integer addBook(Book book);
//    删除一本书
    Integer deleteBookById(@Param("bookId") Integer id);
//    更新一本书
    Integer updateBook(Book book);
//    查询一本书
    Book selectBookById(@Param("bookId") Integer id);
//    查询全部的书
    List<Book> selectAllBooks(String bookName);



}
