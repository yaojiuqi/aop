package com.yjq.aop.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String getUsernameById(Integer id ){
        System.out.println("getUsernameById");
        return "yjq";
    }
    public void deleteById(Integer id){
        System.out.println("deleteById");
    }
}
