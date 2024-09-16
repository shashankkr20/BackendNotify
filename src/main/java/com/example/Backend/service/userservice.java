package com.example.Backend.service;

import com.example.Backend.entity.User;
import com.example.Backend.repository.USerrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class userservice {
    @Autowired
    USerrepository userrep;
    public void add(User u){
        userrep.save(u);
    }
    public User validate(String uname,String password){
        return userrep.findone(uname,password);
    }
    public User getone(int id){
       return userrep.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
    public List<User> getall(){
      return  userrep.findAll();
    }
}
