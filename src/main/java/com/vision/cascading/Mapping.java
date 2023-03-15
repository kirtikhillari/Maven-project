package com.vision.cascading;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Mapping {
   public static void main(String[] args) {
	
	   Configuration cfg=new Configuration();
	   cfg.configure("com/vision/cascading/hibernate.cfg.xml");
	   SessionFactory factory=cfg.buildSessionFactory();
	   
	   
	   
	   Standard_11th stu=new Standard_11th();
	   stu.setRoll_No(4);
	   stu.setName("viki Khillari ");
	   stu.setStd("13th");
	   
	   
	   
	   Standard_11th stu1=new Standard_11th();
	   stu1.setRoll_No(5);
	   stu1.setName("shivi Dike ");
	   stu1.setStd("14th");
	   
	   Standard_11th stu2=new Standard_11th();
	   stu2.setRoll_No(6);
	   stu2.setName("Ovi Dike ");
	   stu2.setStd("15th");
	   
	   City1 c=new City1();
	   c.setCid(103);
	   c.setCity("Solapur");
	   
	   stu.setCity(c);
	   stu1.setCity(c);
	   stu2.setCity(c);
	   
	   List<Standard_11th> list=new ArrayList();
	   list.add(stu);
	   list.add(stu1);
	   list.add(stu2);
	   
	   
	   c.setStd(list);
	   
	   
	   Session session=factory.openSession();
	   session.beginTransaction();
	   
	   session.save(c);
//	   session.save(stu);
//	   session.save(stu1);
//	   session.save(stu2);
	   
	   System.out.println("session save object");
	   session.getTransaction().commit();
	   
	  session.close();
	  factory.close();
	  
	   
	   
	   
	   
}
}
