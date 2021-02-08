package com.example.demo.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "STUDENT")
public class Student {
	@Id
	@Column(name = "SID")
	private int id;
	@Column(name = "Name")
	private String Name;
	@Column(name = "Email")
	private String Email;

}
