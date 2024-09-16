package com.example.Backend.controller;
import com.example.Backend.entity.Recycle;
import com.example.Backend.service.recycleservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/recycle")
public class RecycleController {
    @Autowired
    recycleservice recser;

    @PostMapping("/addrecycle")
    public String add(@RequestBody Recycle r){
        recser.addone(r);
        return "Notes recycled successfully";
    }
    @DeleteMapping("/deleterecycle/{id}")
    public String delete(@PathVariable("id") int id){
        recser.remove(id);
        return "Notes deleted from recycle";
    }
    @GetMapping("/fetchrecycle/{id}")
    public List<Recycle> fetchall(@PathVariable("id") int id){
         return   recser.findrecycle(id);
    }
}
