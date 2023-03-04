package com.relationship;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test
{
	public static void main(String[] args)
	{
		    Configuration cfg = new Configuration();
	        cfg.configure("com/relationship/hibernate.xml");
	        SessionFactory factory = cfg.buildSessionFactory();
	        
	        // create empdetalis
	        EmpDetails em = new EmpDetails();
	        em.setId(301);
	        em.setName("Ramesh");
	        
	        // create address
	        Address ad = new Address();
	        ad.setId(102);
	        ad.setAddress("Banglore");
//	        em.setAddress(ad);  // for unidirectional
	        ad.setEmpDetails(em);
	        
	        Session s = factory.openSession();
	        Transaction tx = s.beginTransaction();
	        
	        s.save(em);
	        s.save(ad);
	        
	        // fetching data from table using one to one mapping...
//	        EmpDetails e = s.get(EmpDetails.class, 201);
//	        System.out.println(e.getName());
//	        
//	        Address a = s.load(Address.class, 101);
//	        System.out.println(a.getAddress());
	        
	        tx.commit();
	        System.out.println("insert successfully...........");
	        s.close();
	        factory.close();
	}
}
