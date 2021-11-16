package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.sms.entity.Student;
import com.example.demo.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentmanagementsystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentmanagementsystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository ;
	
	
	
	@Override
	public void run(String... args) throws Exception {
		
   Student  student1 = new Student("Munashe", "Mehlo", "munashemehlo@gmail.com") ;
	studentRepository.save(student1)	;
	
	 Student  student2 = new Student("Mqondisi", "Mehlo", "mqondisimehlo@gmail.com") ;
		studentRepository.save(student2)	;
		
		 Student  student3 = new Student("Elizabeth", "Mehlo", "elizabethmehlo@gmail.com") ;
			studentRepository.save(student3)	;
	
	
		
	}
      

  
  
}
