package com.example.service.Impl;


import com.example.entity.User;
import com.example.mapper.ExampleMapper;
import com.example.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ExampleServiceImpl implements ExampleService {


    @Autowired
    private ExampleMapper exampleMapper;


    public String hello() {
        User hello = exampleMapper.getHello();


        return String.valueOf(hello);
//        return null;
    }
}
