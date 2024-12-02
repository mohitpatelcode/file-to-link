package com.example.filetolink.repository;



import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.filetolink.entity.FileEntity;


@Repository
public interface FileRepository extends JpaRepository<FileEntity, Integer> {   //jpa contian method is , save, finById, findAll, delete, count
    List<FileEntity> findByExpiryTimeBefore(LocalDateTime now);   //FileEntity is the entity class that corresponds to a table in the database.

}