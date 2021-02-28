package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Homework;

public interface HomeworkRepository extends JpaRepository<Homework,Long>{

}
