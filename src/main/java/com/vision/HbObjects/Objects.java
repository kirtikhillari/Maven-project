package com.vision.HbObjects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Objects {

	
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("com/vision/HbObjects/hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		//Transient
		Student stu=new Student();
	
		stu.setSid(101);
		stu.setName("Siya");
		stu.setCity("Shivrai");
			
		
		
		Session session=factory.openSession();
		
		session.beginTransaction();
		
		//Persistent
		session.save(stu);
		
		
		session.getTransaction().commit();
		
		
		session.close();
		//detached
		
		stu.setName("kirti");
		System.out.println("Project close");
		
		factory.close();
	}
}
