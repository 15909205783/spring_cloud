package com.yangfan.consumer.service;

import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class TestFallbackFactory implements FallbackFactory<FeignFallbackServiceImpl> {
    @Override
    public FeignFallbackServiceImpl create(Throwable cause) {
        return new FeignFallbackServiceImpl();
    }
}
