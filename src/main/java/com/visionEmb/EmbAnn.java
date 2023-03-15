package com.visionEmb;


	
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.cfg.Configuration;

	public class EmbAnn {
	  public static void main(String[] args) {
		

		Configuration cfg= new Configuration();
		cfg.configure("com/visionEmb/hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Student stu=new Student();
		stu.setId(3);
		stu.setName("PS");
		stu.setCity("NA");
		stu.setStd("12th");
		
		Address add=new Address();
		add.setStreet("Localroad1");
		add.setPincode(321176);
	    add.setState("MH");
		
	    stu.setAdd(add);
	    
		Session session=factory.openSession();
		
		session.beginTransaction();
		
		session.save(stu);
		
		session.getTransaction().commit();
		
		session.close();
		factory.close();
	}
	

}
