package com.vision.Fetch;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class City {
	
	@Id
	
	private int cid;
	private String city;
	
	@OneToMany(mappedBy="city")
	private List<Standard_10th>std;

	public City() {
		super();
		// TODO Auto-generated constructor stub
	}

	public City(int cid, String city, List<Standard_10th> std) {
		super();
		this.cid = cid;
		this.city = city;
		this.std = std;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Standard_10th> getStd() {
		return std;
	}

	public void setStd(List<Standard_10th> std) {
		this.std = std;
	}

	@Override
	public String toString() {
		return "City [cid=" + cid + ", city=" + city + ", std=" + std + "]";
	}
	
	
}
