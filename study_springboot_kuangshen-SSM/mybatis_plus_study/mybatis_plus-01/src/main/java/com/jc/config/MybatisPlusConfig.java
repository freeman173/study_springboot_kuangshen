package com.jc.config;

import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.jc.config")
public class MybatisPlusConfig {


    @Bean
    public PaginationInnerInterceptor paginationInnerInterceptor(){

        PaginationInnerInterceptor paginationInnerInterceptor=new PaginationInnerInterceptor();

        return paginationInnerInterceptor;

    }

}
