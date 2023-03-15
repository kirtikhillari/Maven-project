package com.vision2.ProjectWithMaven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
       // System.out.println(factory);
        
        
        //Employee Object
       Employee emp =new Employee();
         
         emp.setName("Vikas");
         emp.setDesignation("IT_Depa");
       emp.setCity("Pune");
         
        System.out.println(emp);
        
        
        System.out.println("Employee object");
        
        
        
        //Address Object
        
        Address ad=new Address();
       
        ad.setStreet("Main road");
        ad.setState("MP");
        ad.setPincode(234790);
        ad.setAddeddate(new Date());
        ad.setStateNO(12);
        
        System.out.println(ad);
        
        
        System.out.println("Address Object");
        
        
        //image reading part
        FileInputStream fis=new FileInputStream("src/main/java/Ring.JPG");
        byte[] data=new byte[fis.available()];
        fis.read(data);
        ad.setImages(data);
        		
        System.out.println("Image added....");
        
        
        Session session=factory.openSession();
        
        session.beginTransaction();
        
        session.save(emp);
        session.save(ad);
        
        session.getTransaction().commit();
        
        session.close();
        
        System.out.println("Project close");
    }
}
