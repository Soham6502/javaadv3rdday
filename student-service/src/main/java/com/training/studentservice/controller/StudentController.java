package com.training.studentservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.studentservice.model.Student;
import com.training.studentservice.repository.StudentRepository;

@RestController //Combination of @Controller+@ResponseBody
@RequestMapping("/studentapi")
public class StudentController {

	@Autowired
	StudentRepository repository;
	
	@GetMapping("/stud")
//	@ResponseBody
	public List<Student> getStud() {
		
		return repository.findAll();
//		List<Student> studList = new ArrayList();
//		studList.add(new Student("Raj",21,"A+"));
//		studList.add(new Student("Rajiv",22,"B+"));
//		studList.add(new Student("Rajesh",23,"A+"));
//		studList.add(new Student("Rajvir",24,"B+"));
//	    return studList;
		
	}
	
	@PostMapping("/post")
	public void post(@RequestBody Student stud) {
		repository.save(stud);
	}
	
}
