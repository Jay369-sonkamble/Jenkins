package com.spring.boot.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.spring.boot.entity.Student_Entity;

public interface StudentRepository extends CrudRepository <Student_Entity,Integer>{

}
