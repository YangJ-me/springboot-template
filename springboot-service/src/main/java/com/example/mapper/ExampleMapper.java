package com.example.mapper;


import com.example.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ExampleMapper {
    User getHello();

}
