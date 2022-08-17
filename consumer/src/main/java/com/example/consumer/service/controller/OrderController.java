package com.example.consumer.service.controller;

import com.example.commoninterface.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("init")
    public List<Object> initOrder() {
        return orderService.initOrder("");
    }

}
