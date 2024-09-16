package com.example.Backend.controller;


import com.example.Backend.entity.notes;
import com.example.Backend.service.notesservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/notes")
public class Notescontroller {
    @Autowired
    notesservice notesser;

    @PostMapping("/addnote")
    public String addnote(@RequestBody notes n){
        notesser.add(n);
        return "notes added successfully";
    }
    @GetMapping("/fetchnotes/{id}")
    public List<notes> findallnotes(@PathVariable("id") int id){
        return  notesser.fetchnotes(id);
    }
    @DeleteMapping("/deletenote/{id}")
    public String deleteanote(@PathVariable("id") int id){
            notesser.deleteone(id);
            return "Note is deleted";

    }
    @PutMapping("/editnote/{id}")
    public String updatenote(@RequestBody notes n,@PathVariable("id") int id){

        System.out.println("hi hello");
        notesser.updateone(n,id);
        return "User Updated successfully";
    }

}
