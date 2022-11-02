
一、项目搭建：

数据库代码：
    create table books(
    book_id int not null auto_increment primary key ,
    book_name varchar(100) not null,
    book_counts int not null,
    detail varchar(200) default null
    
    )ENGINE=INNODB DEFAULT CHARSET=UTF8MB4;
    
    
    insert into books(book_name, book_counts, detail) values
    ( 'java',10,'超人喜欢java'),
    ( '数据结构',2,'刘琪喜欢数据结构'),
    ( '操作系统',10,'刘涛喜欢操作系统'),
    ( 'mysql',5,'俊俊喜欢mysql')


1、在整合mybatis部分： 

之前：
    通过使用sqlsession对象的sqlsession.getMapper(TeacherMapper.class)拿到mapper接口方法;

现在：
    使用了MapperScannerConfigurer类来统一管理映射接口包， 然后直接
使用(BookMapper) applicationContext.getBean("bookMapper")就可以拿到mapper接口方法，方便太多！

注：后面有更多需要再来深入了解！



项目完成，太简单了！

