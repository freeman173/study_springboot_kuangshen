package com.jc.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
//    id字段为数据库表自动生成
    private Integer bookId;
    private String bookName;
    private Integer bookCounts;
    private String detail;

}
