package com.vision2.ProjectWithMaven;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee_Details")
public class Employee {
     
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
		private  int id ;
		  private String name;
		  private String designation;
		  private String city;
		  
		public Employee(int id, String name, String designation, String city) {
			super();
			this.id = id;
			this.name = name;
			this.designation = designation;
			this.city = city;
		}
		

		public Employee() {
			super();
			// TODO Auto-generated constructor stub
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

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}


		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", city=" + city + "]";
		}
		  
	}

