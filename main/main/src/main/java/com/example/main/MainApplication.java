package com.example.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.study.models.Student;
import com.example.study.repository.StudentRepository;
import com.example.study.repository.StudentService;


@SpringBootApplication
@ComponentScan(basePackages = {"com.example.*"})
public class MainApplication {

	@Autowired
	private static StudentService tt;
	
	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
		tt.add();
	}
}
