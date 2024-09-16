package com.example.Backend.service;

import com.example.Backend.entity.Recycle;
import com.example.Backend.repository.RecycleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class recycleservice {
    @Autowired
    RecycleRepository recrep;
    public void addone(Recycle r){
        recrep.save(r);
    }
    public void remove(int id){
        Recycle r=recrep.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
        recrep.delete(r);
    }

    public List<Recycle> findrecycle(int id){
        return recrep.sendall(id);
    }

}
