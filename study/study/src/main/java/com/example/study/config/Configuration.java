package com.example.study.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import com.example.study.repository.StudentRepository;
import com.example.study.repository.StudentService;


@org.springframework.context.annotation.Configuration
@EnableMongoRepositories(basePackageClasses = StudentRepository.class)
public class Configuration {
	
	@Autowired 
	StudentRepository repo;
	
	@Bean
	@ConditionalOnMissingBean
    public StudentService testService() {
        System.out.println("creating Mongo collection service");
        System.out.println(repo.findAll().get(0).getCollege());
        return new StudentService(repo);
    }
	
}
