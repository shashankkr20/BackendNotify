package com.example.Backend.repository;

import com.example.Backend.entity.notes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NotesRepository extends JpaRepository<notes,Integer> {
    @Query("select n from notes n where n.userid=:id")
    List<notes> fetchall(@Param("id") Integer id);
    @Modifying
    @Query("delete  from notes n where n.NotesId=:id")
    void deletesingle(@Param("id") Integer id);
}
