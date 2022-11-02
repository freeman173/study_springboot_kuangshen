package com.jc.service.impl;


import com.jc.dao.BookMapper;
import com.jc.pojo.Book;
import com.jc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;



//@Transactional是spring中常用的注解之一，通常情况下我们在需要对一个service方法添加事务时，
// 加上这个注解，如果发生unchecked exception，就会发生rollback。
@Transactional
public class BookServiceImpl implements BookService {

//  自动注入
    @Autowired
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public Integer addBook(Book book) {

        List<Book> results =this.selectAllBooks(null);
//        如果数据库中已经有添加过的书，就不要再添加了！
        for (Book oneBook:results
             ) {

            if (oneBook.getBookName().equals(book.getBookName())){

                return -1;
            }
        }

        return bookMapper.addBook(book);
    }

    public Integer deleteBookById(Integer id) {
        return bookMapper.deleteBookById(id);
    }

    public Integer updateBook(Book book) {
        return bookMapper.updateBook(book);
    }

    public Book selectBookById(Integer id) {
        return bookMapper.selectBookById(id);
    }

    public List<Book> selectAllBooks(String bookName) {
        return bookMapper.selectAllBooks(bookName);
    }
}
