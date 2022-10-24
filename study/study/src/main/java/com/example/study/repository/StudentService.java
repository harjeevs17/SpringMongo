package com.example.study.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.study.models.Student;


@Service
public class StudentService {

	
	StudentRepository repo;
	
	public StudentService(StudentRepository r) {
		this.repo = r;
	}
	public void add() {
		Student temp = new Student();
		temp.setId(14);
		temp.setName("test");
		temp.setCollege("test");
		temp.setCity("test");
		repo.save(temp);
	}
}
