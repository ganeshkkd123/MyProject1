package com.myproject.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.project.entity.Student;
import com.myproject.project.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo studentRepo;
	
	@Override
	public String upsert(Student student) {
		studentRepo.save(student);
		return "sucess";
	}

	@Override
	public Student getById(Integer id) {
		Optional<Student> findById = studentRepo.findById(id);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public List<Student> getAllStudents() {
		
		return studentRepo.findAll();
	}

	@Override
	public String deleteById(Integer id) {
		if(studentRepo.existsById(id)) {
			studentRepo.deleteById(id);
			return "delete success";
		}else {
		    return "record not found";
		}
	}

}
