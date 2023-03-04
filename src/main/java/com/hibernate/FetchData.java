package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchData {
	public static void main(String[] args) 
	{
		  Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory factory = cfg.buildSessionFactory();
	        
	        Session session = factory.openSession();
	       
	        // load:- student
	       Student student = session.get(Student.class, 11);
	       Student student1 = session.get(Student.class, 11);
//	       System.out.println(student.getName());
	       System.out.println(student);
	       System.out.println(student1);
	       
	       // get:-Emp
	       Emp emp1 =  session.load(Emp.class, 1);
	       Emp emp2 =  session.load(Emp.class, 1);
//	       System.out.println(emp1.getEmail());
	       System.out.println(emp1);
	       System.out.println(emp2);
	       session.close();
	       factory.close();
	}
}
