package com.yangfan.feign.service;

import com.yangfan.feign.service.HelloService;

public class FeignFallbackServiceImpl implements HelloService {
    @Override
    public String hello() {
        return "系统异常，请稍后再试 -- 11111111";
    }

    @Override
    public String testTimeout() {
        return "系统异常，请稍后再试 -- 222222222222";
    }
}
