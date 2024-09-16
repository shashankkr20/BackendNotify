package com.example.Backend.service;

import com.example.Backend.entity.Archive;
import com.example.Backend.entity.Recycle;
import com.example.Backend.repository.ArchiveRepository;
import com.example.Backend.repository.RecycleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
@Service
public class archiveservice {
    @Autowired
    ArchiveRepository archrep;

    public void addone(Archive r){
        archrep.save(r);
    }
    public void remove(int id){
        Archive r=archrep.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
        archrep.delete(r);
    }

    public List<Archive> findrecycle(int id){
        return archrep.sendall(id);
    }
}
