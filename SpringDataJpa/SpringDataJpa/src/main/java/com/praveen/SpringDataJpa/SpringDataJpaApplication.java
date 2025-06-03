package com.praveen.SpringDataJpa;

import com.praveen.SpringDataJpa.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringDataJpaApplication.class, args);
		Student s1=context.getBean(Student.class);
		Student s2=context.getBean(Student.class);
		Student s3=context.getBean(Student.class);
		StudentRepo repo=context.getBean(StudentRepo.class);
		s1.setRollNo(1);
		s1.setName("praveen");
		s1.setAge(21);
		s2.setRollNo(2);
		s2.setName("karthik");
		s2.setAge(19);
		s3.setRollNo(3);
		s3.setName("parveen");
		s3.setAge(20);
//		repo.save(s1);
//		repo.save(s2);
//		repo.save(s3);
		System.out.println(repo.findByName("praveen"));

	}

}
