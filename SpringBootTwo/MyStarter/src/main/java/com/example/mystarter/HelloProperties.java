package com.example.mystarter;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "hello") // 对外提供的前缀，相当于其它引入当前starter在properties文件使用hello.属性即可对下面属性进行赋值
public class HelloProperties {

    private String prefix="jc/"; // 成员属性，意思是前缀名
    private String suffix=".html"; // 成员属性，意思是后缀名

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
