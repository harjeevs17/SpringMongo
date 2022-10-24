package com.example.main.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.example.study.repository.StudentRepository;
import com.example.study.repository.StudentService;

@Configuration
@Import({Configuration.class})
public class Config {
	
	@Autowired
	private StudentService ss;
	
	
	
}
