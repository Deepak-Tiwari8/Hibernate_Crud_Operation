package com.dailyCoding;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class Delete 
{
    public static void main( String[] args )
    {
        Configuration cf = new Configuration();
        cf.configure();
        SessionFactory sessionFactory = cf.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Employee emp1 =(Employee) session.get(Employee.class, 1);
        session.delete(emp1);
        transaction.commit();
        session.close();
        System.out.println("Employee Deleted");
    }
}
