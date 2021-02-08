package com.spring.boot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

//@Data
@Entity
@Table(name="STUDENT_DTLS")
public class Student_Entity {
	
	@Id
@Column(name="ID")
private int id;
	@Column(name="NAME")
private String Name;
	@Column(name="EMAIL")
private String Emailid;
	@Column(name="CONTACTNO")
private double contactNo;
	
	
	
	public Student_Entity(int id, String name, String emailid, double contactNo) {
		
		this.id = id;
		this.Name = name;
		this.Emailid = emailid;
		this.contactNo = contactNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmailid() {
		return Emailid;
	}
	public void setEmailid(String emailid) {
		Emailid = emailid;
	}
	public double getContactNo() {
		return contactNo;
	}
	public void setContactNo(double contactNo) {
		this.contactNo = contactNo;
	}
	@Override
	public String toString() {
		return "Student_Entity [id=" + id + ", Name=" + Name + ", Emailid=" + Emailid + ", contactNo=" + contactNo
				+ "]";
	}
	

}
