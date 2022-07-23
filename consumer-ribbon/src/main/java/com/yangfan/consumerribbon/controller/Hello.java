package com.yangfan.consumerribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("foo/")
public class Hello {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("hello")
    public String hello() {

        return restTemplate.getForObject("http://PROVIDER-HI/hello", String.class) + " world!";
    }

    @GetMapping("testTimeout")
    public String testTimeout() {

        return restTemplate.getForObject("http://PROVIDER-HI/testTimeout", String.class) ;
    }
}
