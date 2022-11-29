package com.dailyCoding;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class Insert 
{
    public static void main( String[] args )
    {
        Configuration cf = new Configuration();
        cf.configure();
        SessionFactory sessionFactory = cf.buildSessionFactory();
        
        Employee emp1 = new Employee();
        emp1.setEname("Deepak");
        emp1.setEmail("Deepak6226@gmail.com");
        emp1.setEaddress("Bengalore");
        emp1.setEphone(8225098183l);
        
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(emp1);
        transaction.commit();
        session.close();
        System.out.println(emp1);
    }
}
