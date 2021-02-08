package com.spring.boot.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring.boot.entity.Student_Entity;
import com.spring.boot.repository.StudentRepository;
@Component
public class studentRunner implements CommandLineRunner {
	@Autowired
	private  StudentRepository repo;
	@Override
	public void run(String... args) throws Exception {
		
		
		
	List<Student_Entity>	list= Arrays.asList(new Student_Entity (101,"jaya","jaya@gmail.com",478654),
			                                    new Student_Entity (102,"jayu","jaya@gmail.com",478654));
	
	repo.saveAll(list);
}
}