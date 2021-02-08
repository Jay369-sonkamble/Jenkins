package com.example.demo.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Student;


public interface StudentRepository extends CrudRepository<Student,Serializable>{

	
//	@Query(" select Name from StudentEntity ")
//	public List<String> findAllName();
}
