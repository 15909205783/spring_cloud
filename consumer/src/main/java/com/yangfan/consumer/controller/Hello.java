package com.yangfan.consumer.controller;

import com.yangfan.feign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("foo/")
public class Hello {

    @Autowired
    public HelloService helloService;

    @GetMapping("hello")
    public String hello() {
        return helloService.hello() + " world!";
    }
}
