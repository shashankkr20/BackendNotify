package com.example.Backend.repository;

import com.example.Backend.entity.Recycle;
import com.example.Backend.entity.notes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RecycleRepository extends JpaRepository<Recycle,Integer> {
    @Query("select n from Recycle n where n.userid=:id")
    List<Recycle> sendall(@Param("id") Integer id);
}
