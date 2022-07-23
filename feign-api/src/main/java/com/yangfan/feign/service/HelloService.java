package com.yangfan.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "PROVIDER-HI",fallback = FeignFallbackServiceImpl.class)
@Component
public interface HelloService {

    @GetMapping("/hello")
    String hello();

    @GetMapping("testTimeout")
    String testTimeout();
}
