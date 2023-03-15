package com.visionEmb;


	import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

	@Entity
	public class Student {
		@Id
	   private int id;
	   private String name;
	   private String city;
	   private String std;
	   
	   private Address add;
	   
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int id, String name, String city, String std ) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.std = std;
		this.add=add;
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


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getStd() {
		return std;
	}


	public void setStd(String std) {
		this.std = std;
	}


	public Address getAdd() {
		return add;
	}


	public void setAdd(Address add) {
		this.add = add;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", std=" + std + ", add=" + add + "]";
	}



	   
	

}
