package com.example.entity;


import lombok.Data;

@Data
public class User {
    private long id;
    private String username;
    private String password;
    private String phone;
}
