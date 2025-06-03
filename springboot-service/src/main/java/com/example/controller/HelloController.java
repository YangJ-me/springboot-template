package com.example.controller;

import com.example.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
    @Autowired
    private ExampleService exampleService;
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @GetMapping("/hello")
    public String hello() {
        System.out.println("redisTemplate = " + redisTemplate);
        redisTemplate.opsForValue().set("name", "张三");
        return redisTemplate.opsForValue().get("name").toString();
//        return exampleService.hello();
//        return "Hello, Spring Boot!";
    }
}
