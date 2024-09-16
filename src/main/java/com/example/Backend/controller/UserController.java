package com.example.Backend.controller;

import com.example.Backend.entity.User;
import com.example.Backend.service.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserController {
    @Autowired
    userservice userser;

    @PostMapping("/adduser")
    public String adduser(@RequestBody User u){
        userser.add(u);
        return "user added Successfully";

    }
    @GetMapping("/login/{uname}/{pass}")
    public User login(@PathVariable String uname ,@PathVariable String pass){
        return userser.validate(uname,pass);

    }
}
