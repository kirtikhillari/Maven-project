package com.vision.Mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class City {
	
   @Id
	private int Cid;
	private String CName;
	
	@OneToOne
	@JoinColumn(name="CITY")
	private College_Name ci;
	
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	public City(int cid, String cName) {
		super();
		Cid = cid;
		CName = cName;
	}
	public int getCid() {
		return Cid;
	}
	public void setCid(int cid) {
		this.Cid = cid;
	}
	public String getCName() {
		return CName;
	}
	public void setCName(String cName) {
		this.CName = cName;
	}
	
	public College_Name getCi() {
		return ci;
	}
	public void setCi(College_Name ci) {
		this.ci = ci;
	}
	@Override
	public String toString() {
		return "City [Cid=" + Cid + ", CName=" + CName + ",ci="+ci+"]";
	}
	
	
	
}
