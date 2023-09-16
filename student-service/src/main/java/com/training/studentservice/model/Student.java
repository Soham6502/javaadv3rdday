package com.training.studentservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //mandatory to make table of class , name will be same as class name
//@Table(name="STUD") //to change name to STUD
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long studId;
	private String studName;
	private int age;
	@Column(name="stud_grade")
	private String grade;
	
	public Student(String studName, int age, String grade) {
		super();
		this.studName = studName;
		this.age = age;
		this.grade = grade;
	}
	public Student() {
		super();
	}
	
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}
