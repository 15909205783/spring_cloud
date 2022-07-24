package com.yangfan.consumer.controller;

import com.yangfan.consumer.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping("foo/")
public class Hello {

    private AtomicInteger count = new AtomicInteger(1);

    @Resource
    public HelloService helloService;

    @GetMapping("hello")
    public String hello() {
        System.out.println(count.getAndIncrement());
        return helloService.hello() + " world!";
    }

    @GetMapping("testTimeout")
    public String testTimeout(){
        System.out.println(count.getAndIncrement());
        String message = helloService.testTimeout();
        System.out.println(message);
        return message;
    }
}
