package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	// Class data members with @Value
	private int rollNo;
	private String name;
	private int age;
	private String priority;
	
	public Student(@Value("${student.rollNo}") int rollNo
			     , @Value("${student.name}") String name
			     , @Value("${student.age}") int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	@Value("${priority:normal}")
	public void setPriority(String priority) {
		this.priority = priority;
	}

	public void displayInfo() {
		// Print statement
		System.out.println("Roll No: " + rollNo);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Priority: " + priority);
	}
}
