package com.yangfan.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "PROVIDER")
@Component
public interface HelloService {

    @GetMapping("/hello")
    String hello();
}
