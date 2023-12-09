package com.example.curdoperation.repository;

import com.example.curdoperation.entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositoryJpa extends JpaRepository<Student,Integer> {
}
