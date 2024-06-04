package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRep;

@Service
public class StudentService {
@Autowired
StudentRep sr;

public String save_stu(Student s) {
	sr.save(s);
	return "Data saver successfully";
}
public List<Student> view_stud(){
	return sr.findAll();
}
public Optional<Student> view_one_stu(Long id){
	return sr.findById(id);
}
public String del_stu(Long id){
	sr.deleteById(id);
	return id + "deleted successfully";
}
}