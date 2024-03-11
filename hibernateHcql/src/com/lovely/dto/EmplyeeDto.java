package com.lovely.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
@Entity
public class EmplyeeDto {
	@Id// MAKING PRIMARY KEY OF ID FIELD
	//for make id auto increment
//	@GeneratedValue(generator="auto")
//	@GenericGenerator(name="auto",strategy="increment")
	private int id;
	private String name;
	private String designation;
	private double salary;
	

	@Override
	public String toString() {
		return "Dto [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
