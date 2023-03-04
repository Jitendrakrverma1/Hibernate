package com.onetomany;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.List;

public class App {

	public static void main(String[] args) 
	{
		 Configuration cfg = new Configuration();
	        cfg.configure("com/onetomany/hibernate.c.xml");
	        SessionFactory factory = cfg.buildSessionFactory();
	        
	        Address ad= new Address(101,"Permannent Address","Delhi");
	        Address ad1 = new  Address(102,"office Address","Banglore");
	        
	    java.util.List<Address> list = new ArrayList<Address>();
	        list.add(ad);
	        list.add(ad1);
	        
	        EmpDtls em = new EmpDtls();
	        em.setId(201);
	        em.setName("Pavy kumar");
	        em.setAddress(list);
	        
	        Session s = factory.openSession();
	        
	        Transaction tx = s.beginTransaction();
	        s.save(ad);
	        s.save(ad1);
	        s.save(em);
	        tx.commit();
	        s.close();
	        factory.close();

	}

}
