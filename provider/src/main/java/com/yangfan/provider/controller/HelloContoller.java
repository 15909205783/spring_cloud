package com.yangfan.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContoller {

    @GetMapping("hello")
    public String hello(){
        return "hello";
    }

    public String testTimeoutReserveCase() {
        return "当前服务器繁忙，请稍后再试！！！";
    }

// 定义服务降级策略
//    @HystrixCommand(
//            // 当请求超时 或者 接口异常时，会调用 fallbackMethod 声明的方法（方法参数要一致）
//            fallbackMethod = "testTimeoutReserveCase",
//            commandProperties = {
//                    @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds", value="1500")
//            }
//    )
    @GetMapping("/testTimeout")
    public String testTimeout() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "ok";
    }
}
