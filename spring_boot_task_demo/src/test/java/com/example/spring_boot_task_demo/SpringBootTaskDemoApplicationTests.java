package com.example.spring_boot_task_demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@SpringBootTest
class SpringBootTaskDemoApplicationTests {

    @Autowired
    JavaMailSenderImpl mailSender;


    @Test
    void contextLoads() {
//        发送邮件
        SimpleMailMessage mailMessage=new SimpleMailMessage();
        mailMessage.setSubject("我是超哥！！");
        mailMessage.setText("超人学习spring_boot的邮件功能！！");
        mailMessage.setFrom("1669792108@qq.com");
        mailMessage.setTo("1669792108@qq.com");

        mailSender.send(mailMessage);
    }

    @Test
//    发一个复杂邮件
    void contextLoads2() throws MessagingException {

        MimeMessage mimeMessage=mailSender.createMimeMessage();
        MimeMessageHelper helper=new MimeMessageHelper(mimeMessage,true);


        helper.setSubject("超人又来了！");
//        标记为html格式
        helper.setText("<p style='color:red'>滴滴</p>",true);
        helper.addAttachment("1.jpg", new File("D:\\STUDY\\JC\\PROJECT OF JAVA\\spring_boot_task_demo\\src\\main\\resources\\note\\imgs\\1.jpeg"));

        helper.setFrom("1669792108@qq.com");
        helper.setTo("1669792108@qq.com");

        mailSender.send(mimeMessage);

    }



}
