package com.vision.cascading;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Standard_11th {

	@Id
	private int Roll_No;
	private String Name;
	private String Std;
	
	@ManyToOne
	private City1 city;

	public Standard_11th() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Standard_11th(int roll_No, String name, String std, City1 city) {
		super();
		Roll_No = roll_No;
		Name = name;
		Std = std;
		this.city = city;
	}
	

	public int getRoll_No() {
		return Roll_No;
	}

	public void setRoll_No(int roll_No) {
		Roll_No = roll_No;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getStd() {
		return Std;
	}

	public void setStd(String std) {
		Std = std;
	}

	public City1 getCity() {
		return city;
	}

	public void setCity(City1 city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Standard_10th [Roll_No=" + Roll_No + ", Name=" + Name + ", Std=" + Std + ", city=" + city + "]";
	}
	
}
