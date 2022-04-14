package com.jc.providerserver.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

//这里的service是dubbo的
@Service
@Component
public class TicketServiceImpl implements TicketService{

    @Override
    public String getTicket() {
        return "超人在学duboo！！";
    }
}
