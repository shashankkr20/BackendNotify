package com.example.Backend.controller;

import com.example.Backend.entity.Archive;
import com.example.Backend.entity.Recycle;
import com.example.Backend.entity.notes;
import com.example.Backend.repository.ArchiveRepository;
import com.example.Backend.service.archiveservice;
import com.example.Backend.service.recycleservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/archive")
public class ArchiveController {
    @Autowired
    archiveservice arcser;

    @PostMapping("/addarchive")
    public String add(@RequestBody Archive r){
       arcser.addone(r);
        return "Notes recycled successfully";
    }
    @DeleteMapping("/deletearchive/{id}")
    public String delete(@PathVariable("id") int id){
        arcser.remove(id);
        return "Notes deleted from recycle";
    }
    @GetMapping("/fetcharchive/{id}")
    public List<Archive> fetchall(@PathVariable("id") int id){
        return   arcser.findrecycle(id);
    }
}
