package com.example.Backend.service;

import com.example.Backend.entity.User;
import com.example.Backend.entity.notes;
import com.example.Backend.repository.NotesRepository;
import com.example.Backend.repository.RecycleRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class notesservice {
    @Autowired
    NotesRepository notesrep;


    public void add(notes u){
        notesrep.save(u);

    }
    public List<notes> fetchnotes(Integer id){
        return notesrep.fetchall(id);
    }
    @Transactional
    public void deleteone(int id){
        notesrep.deletesingle(id);
    }
    public void updateone(notes n,int id){
      notes a= notesrep.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
      a.copy(n);
      notesrep.save(a);
    }
}
