package com.hibernate;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project started..." );
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        // creating student object
//        Student student = new Student();
//        student.setId(13);
//        student.setName("Jitendra");
//        student.setEmail("chandan1@gmail.com");
//        student.setAddress("Kurebhar");
        
        // creating emp
        Emp emp1 = new Emp();
        emp1.setId(12);
        emp1.setEmpName("Kola1");
        emp1.setEmail("jack1@gmail.com");
        emp1.setStatus(true);
        emp1.setToken("1111");
        emp1.setSalary(110001);
        emp1.setJoiningDate(new Date());
        
       
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
//      session.save(student);
        session.save(emp1);
        tx.commit();
        
        session.close();
        System.out.println("-----All done-----");
    }
}















//Session factory = (Session) new Configuration().configure().buildSessionFactory();
