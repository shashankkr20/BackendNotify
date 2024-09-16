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
public class Recycle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer recid;
    Integer userid;
    String title;
    String date;
    String content;
}
