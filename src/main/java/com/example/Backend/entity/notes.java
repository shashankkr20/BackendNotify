package com.example.Backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer NotesId;
    Integer userid;
    String title;
    String date;
    String content;
    public void copy(notes n){
        this.userid=n.userid;
        this.title=n.title;
        this.content=n.content;
        this.date=n.date;

    }
}
