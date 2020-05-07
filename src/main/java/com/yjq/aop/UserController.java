package com.yjq.aop;

import com.yjq.aop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/test1")
    public String getUsernameById(Integer id ){
        return userService.getUsernameById(id);
    }
    @GetMapping("/test2")
    public void deleteById(Integer id){
        userService.deleteById(id);
    }
}
