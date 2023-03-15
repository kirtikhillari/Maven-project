package com.vision.OTMMTOMapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Mapping {
   public static void main(String[] args) {
	
	   Configuration cfg=new Configuration();
	   cfg.configure("com/vision/OTMMTOMapping/hibernate.cfg.xml");
	   SessionFactory factory=cfg.buildSessionFactory();
	   
	   
	   
	   Standard_10th stu=new Standard_10th();
	   stu.setRoll_No(3);
	   stu.setName("viki Khillari ");
	   stu.setStd("13th");
	   
	   
	   
	   Standard_10th stu1=new Standard_10th();
	   stu1.setRoll_No(4);
	   stu1.setName("shivi Dike ");
	   stu1.setStd("14th");
	   
	   City c=new City();
	   c.setCid(102);
	   c.setCity("Solapur");
	   
	   stu.setCity(c);
	   stu1.setCity(c);
	   
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
