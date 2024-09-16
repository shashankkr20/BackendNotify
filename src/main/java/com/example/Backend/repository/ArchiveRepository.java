package com.example.Backend.repository;

import com.example.Backend.entity.Archive;
import com.example.Backend.entity.Recycle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ArchiveRepository extends JpaRepository<Archive,Integer> {
    @Query("select n from Archive n where n.userid=:id")
    List<Archive> sendall(@Param("id") Integer id);
}
