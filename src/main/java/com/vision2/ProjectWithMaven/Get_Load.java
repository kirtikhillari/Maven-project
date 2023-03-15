package com.vision2.ProjectWithMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Get_Load {
    public static void main(String[] args) {
    	
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		
		
		
		Employee emp=(Employee)	session.get(Employee.class,1);
		System.out.println(emp);
		//System.out.println(emp.getName()+ "  " +emp.getCity());
		
		
		Address ad=(Address)session.load(Address.class, 1);
		System.out.println(ad);
		System.out.println(ad.getStreet()+" "+ ad.getState());
		
		
		
		session.close();
		factory.close();
		
	}
}
