package com.mapping.xml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Mapping {
  public static void main(String[] args) {
	

	Configuration cfg=new Configuration();
	cfg.configure("com/mapping/xml/hibernate.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	
	
	Books book=new Books();
	book.setAutId(03);
	book.setPrice(943);
	book.setAutName("TR");
	book.setAutBook("politics");
	book.setAutCity("simla");
	
	
	
	Books book1=new Books();
	book1.setAutId(04);
	book1.setPrice(643);
	book1.setAutName("sagar k");
	book1.setAutBook("History");
	book1.setAutCity("pune");
	
	
	Session session=factory.openSession();
	session.beginTransaction();
	session.save(book);
	session.save(book1);
	session.getTransaction().commit();
	
	
	
	session.close();
	
	
			
}
}