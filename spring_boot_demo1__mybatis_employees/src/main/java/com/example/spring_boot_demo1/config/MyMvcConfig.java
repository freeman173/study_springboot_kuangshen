package com.example.spring_boot_demo1.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;



//使用该类来扩展mvc，controller就可以不用写了
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
//    此处ctrl+i:选择重写方法
    @Override
//    增加各个controller
    public void addViewControllers(ViewControllerRegistry registry) {
//        前面的参数为浏览器访问路径，后面的参数为template中的参数文件名（省去后缀）。
       registry.addViewController("/").setViewName("index");
       registry.addViewController("/index.html").setViewName("index");
       registry.addViewController("/main.html").setViewName("dashboard");
       registry.addViewController("/list.html").setViewName("list");
    }

  //  将写好的拦截器配置到项目中（暂时不用）
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor())
                //                将这些路径匹配的元素放行。
                .addPathPatterns("/**").excludePathPatterns("/index.html","/","/login","/css/**","/img/**","/js/**");

    }

    //    将该类标记为javabean，方便后面自动注入
    @Bean
// 自己写的视图解析器
    public ViewResolver myViewResolver(){
        return new MyViewResolver();
    }


//    自己定义的视图解析器
    public static class MyViewResolver implements ViewResolver{

        @Override
        public View resolveViewName(String viewName, Locale locale) throws Exception {
            return null;
        }
    }


}


