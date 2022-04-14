package com.jc.consumerservertwo.service;


import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Reference
    TicketService ticketService;

    public void buyTicket(){
        String ticket=ticketService.getTicket();

        System.out.println("在注册中心拿到=>"+ticket);

    }


}
