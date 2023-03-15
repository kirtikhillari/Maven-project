package com.vision.Mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Map {
        
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("com/vision/Mapping/hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		College_Name c=new College_Name();
		c.setId(1);
		c.setCollegeName("MIT.college");
		c.setGrade("C");
		
		
		
		
		City ci=new City();
		ci.setCid(907);
		ci.setCName("Pune");
		
		ci.setCi(c);
		
		c.setCName(ci);
		
		Session session=factory.openSession();
		session.beginTransaction();
		
		session.save(c);
		session.save(ci);
		
		
		
		session.getTransaction().commit();
		session.close();
		factory.close();
	}
}
