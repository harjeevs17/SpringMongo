package com.example.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.study.models.Student;
import com.example.study.repository.StudentRepository;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired StudentRepository repo;
	
	@PostMapping("/add")
	public ResponseEntity<?> addStudent(@RequestBody Student student){
		Student save = this.repo.save(student);
		return ResponseEntity.ok(save);
		
	}
	@GetMapping("/get")
	public ResponseEntity<?> getStudent(){
		return ResponseEntity.ok(this.repo.findAll());
		
	}
}
