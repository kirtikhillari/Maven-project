package com.vision.Mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class College_Name {
	
   @Id
	private int id;
	private String CollegeName;
	private String grade;
	
	@OneToOne
	@JoinColumn(name="CITY_Name")
	private City CName;
	
	
	
	 
		public College_Name() {
			super();
			// TODO Auto-generated constructor stub
		}

	public College_Name(int id, String collegeName, String grade) {
		super();
		this.id = id;
		CollegeName = collegeName;
		this.grade = grade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCollegeName() {
		return CollegeName;
	}

	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	public City getCName() {
		return CName;
		
	}
	public void  setCName(City CName) {
		this.CName=CName;
	}

	@Override
	public String toString() {
		return "College_Name [id=" + id + ", CollegeName=" + CollegeName + ", grade=" + grade + " ,City= "+CName+"]";
	}
		
}
