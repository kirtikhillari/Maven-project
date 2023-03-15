package com.vision.SqlQuery;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.vision2.ProjectWithMaven.Employee;


public class SqlQuery {
    
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		
		String ql="select * from Employee where Eid=2 ";
		
		NativeQuery a=session.createSQLQuery(ql);
				
		List<Object[]>list=a.list();
		
				for(Object[] e: list) {
					
				System.out.println(Arrays.toString(e));	
				}
				
		session.close();
		factory.close();
	}
}
