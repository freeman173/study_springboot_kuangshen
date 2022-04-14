package com.example.spring_boot_swagger_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableOpenApi//因为访问不了swagger-ui界面，所以添加的标记
@SpringBootApplication
public class SpringBootSwaggerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSwaggerDemoApplication.class, args);
    }

}
