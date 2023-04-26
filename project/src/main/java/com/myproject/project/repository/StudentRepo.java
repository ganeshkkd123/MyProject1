package com.myproject.project.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.project.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Serializable> {
	
}