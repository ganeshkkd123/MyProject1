package com.myproject.project.service;

import java.util.List;

import com.myproject.project.entity.Student;

public interface StudentService {
	
	public String upsert(Student student);
	public Student getById(Integer id);
	public List<Student> getAllStudents();
	public String deleteById(Integer id);
}