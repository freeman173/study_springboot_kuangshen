package com.example.demo3.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;

/*
扩展mvc。

在config下自定义配置文件并交给springboot，springboot就会帮我们自动装配

 */



@Configuration
public class MyMvcConfig implements WebMvcConfigurer {


    /*
        在ioc中注入一个视图解析器的bean,springboot自动装配模块将这个解析器类放入到视图候选项中供系统候选。

     */
    @Bean
    public ViewResolver myViewResolver(){

        return new MyViewResolver();
    }


/*
public class ContentNegotiatingViewResolver implements ViewResolver{}:
    实现了视图解析器接口的类，就是视图解析器

自定义一个视图解析器
 */
    public static class MyViewResolver implements ViewResolver{
        @Override
        public View resolveViewName(String viewName, Locale locale) throws Exception {

            return null;

        }
    }



/*
增加一个视图映射路径
 */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/main").setViewName("dashboard");

    }

/*

添加一个拦截器

 */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        拦截的路径
        registry.addInterceptor(new LoginHandlerIntercepter()).addPathPatterns("/**")
                .excludePathPatterns("/index","/login");

    }
}
