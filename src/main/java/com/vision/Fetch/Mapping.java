package com.vision.Fetch;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Mapping {
   public static void main(String[] args) {
	
	   Configuration cfg=new Configuration();
	   cfg.configure("com/vision/Fetch/hibernate.cfg.xml");
	   SessionFactory factory=cfg.buildSessionFactory();
	   
	   
	   
	   Standard_10th stu=new Standard_10th();
	   stu.setRoll_No(1);
	   stu.setName("Sima ");
	   stu.setAge(23);
	   
	   
	   
	   Standard_10th stu1=new Standard_10th();
	   stu1.setRoll_No(2);
	   stu1.setName(" Dike ");
	   stu1.setAge(21);
	   
	   City c=new City();
	   c.setCid(102);
	   c.setCity("Vaijapur");
	   
	  
//	   stu.setCity(c);
//	   stu1.setCity(c);
//	   
	  
	   List<Standard_10th> list=new ArrayList();
	   list.add(stu);
	   list.add(stu1);
	   
	   
	   c.setStd(list);
	   
	   
	   Session session=factory.openSession();
	   session.beginTransaction();
	   
	   session.save(c);
	   session.save(stu);
	   session.save(stu1);
	   
	   System.out.println("session save object");
	   session.getTransaction().commit();
	  session.close();
	  factory.close();
	  
	   
	   
	   
	   
}
}
