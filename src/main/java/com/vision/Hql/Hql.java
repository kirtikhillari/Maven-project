package com.vision.Hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.vision2.ProjectWithMaven.Employee;


public class Hql {

	
	
	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		
		Session session=factory.openSession();
		session.beginTransaction();
		
		//HQL query
		
		//String query="from Employee as emp  where emp.id=3 and emp.city=:C";
		//Query que=session.createQuery(query);
		
		
		Query que =session.createQuery("from Employee as emp where emp.id=2 and emp.city=:C");
		
		//que.setParameter("A", 2);
		que.setParameter("C", "pune");
		
		
		List<Employee>list=que.list();
		
		
		for(Employee e:list) {
			
			System.out.println(e.getName()+" "+ e.getDesignation());
		}
		System.out.println("Selected......");
		
		//Delete
//		
//		Query del=session.createQuery("Delete from Employee where id=:i");
//		
//		del.setParameter("i",2);
//		
//		int d=del.executeUpdate();
//		System.out.println("Deleted.......");
//		System.out.println(d);
		
		
		//update
		
		Query up=session.createQuery("update Employee set city=:c where id=:i");
		up.setParameter("c", "Nashik");
		up.setParameter("i", 3);
		int upd=up.executeUpdate();
		
		System.out.println("updated......");
		System.out.println(upd);
		
		
		//join
		
		Query q4=session.createQuery("select e.eid,e.ename,p.pname from Employee as e inner join e.projects as p ");
		
		List <Object[]>list2=q4.getResultList();
		
		
		for(Object[]  arr :list2){
			
			System.out.println(Arrays.toString(arr));
		}
			System.out.println("join......");
		
		
		session.close();
		factory.close();
	}
}

