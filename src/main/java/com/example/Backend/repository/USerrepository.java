package com.example.Backend.repository;

import com.example.Backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface USerrepository extends JpaRepository<User,Integer> {

    @Query("select u from User u where u.username=:uname and u.password=:pass ")
    Optional<User> findone(@Param("uname") String uname, @Param("pass") String pass);

}
