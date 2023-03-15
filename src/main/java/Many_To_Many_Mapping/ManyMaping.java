package Many_To_Many_Mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManyMaping {
   public static void main(String[] args) {
	

	Configuration cfg= new Configuration();
	cfg.configure("Many_To_Many_Mapping/Hibernate.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	
	Employee emp=new Employee();
	Employee emp1=new Employee();
	
	emp.setEid(1);
	emp.setName("Kirti");
	
	emp1.setEid(2);
	emp1.setName("Payal");
	
	
	Project p=new Project();
	Project p1=new Project();
	
	
	p.setPid(201);
	p.setPname("Collection_Of_Seeds");
	
	p1.setPid(202);
	p1.setPname("Charcole_Property");
	
	List<Employee> list1=new ArrayList<Employee>();
	List<Project>list2=new ArrayList<Project>();
	
	
	list1.add(emp);
	list1.add(emp1);
	
	list2.add(p);
	list2.add(p1);
	
	
	emp.setProject(list2);
	emp1.setProject(list2);
	
	
	
	
	p.setEmployee(list1);
	
	
	Session session=factory.openSession();
	
	session.beginTransaction();
	
	session.save(emp);
	session.save(emp1);
	 session.save(p);
	session.save(p1);
	
	System.out.println("Session save object");
	
	session.getTransaction().commit();
	
	session.close();
	factory.close();
}
}