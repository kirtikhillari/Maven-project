package com.mapping.xml;

public class Books {

	private int autId;
	private int price;
	private String autName;
	private String autBook;
	private String autCity;
	
	
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Books(int price, String autName, String autBook, String autCity) {
		super();
		this.autId=autId;
		this.price = price;
		this.autName = autName;
		this.autBook = autBook;
		this.autCity = autCity;
	}


	public int getAutId() {
		return autId;
	}


	public void setAutId(int autId) {
		this.autId = autId;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getAutName() {
		return autName;
	}


	public void setAutName(String autName) {
		this.autName = autName;
	}


	public String getAutBook() {
		return autBook;
	}


	public void setAutBook(String autBook) {
		this.autBook = autBook;
	}


	public String getAutCity() {
		return autCity;
	}


	public void setAutCity(String autCity) {
		this.autCity = autCity;
	}


	@Override
	public String toString() {
		return "Books [autId=" + autId + ", price=" + price + ", autName=" + autName + ", autBook=" + autBook
				+ ", autCity=" + autCity + "]";
	}
	
	
}
