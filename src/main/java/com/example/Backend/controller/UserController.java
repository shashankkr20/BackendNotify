package com.example.Backend.controller;

import com.example.Backend.entity.User;
import com.example.Backend.service.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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
    public ResponseEntity<User> login(@PathVariable String uname, @PathVariable String pass) {
        Optional<User> usr = userser.validate(uname, pass);
        if (usr.isPresent()) {
            return ResponseEntity.ok(usr.get());  // Return 200 OK with the user object
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();  // Return 401 Unauthorized
        }
    }
}
