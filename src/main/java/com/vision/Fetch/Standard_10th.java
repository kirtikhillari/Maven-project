package com.vision.Fetch;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Standard_10th {

	@Id
	private int roll_No;
	private String name;
	private int age;
	
	@ManyToMany
	private City city;

	public Standard_10th() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Standard_10th(int roll_No, String name, int age) {
		super();
		this.roll_No = roll_No;
		this.name = name;
		this.age = age;
	}
	public int getRoll_No() {
		return roll_No;
	}
	public void setRoll_No(int roll_No) {
		this.roll_No = roll_No;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Standard_10th [roll_No=" + roll_No + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}
