package com.example.study.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.study.models.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student,Integer> {

}
