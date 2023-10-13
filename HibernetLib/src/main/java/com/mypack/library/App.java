package com.mypack.library;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 Configuration cfg = new Configuration();
         cfg.configure("hibernate.cfg.xml");
         SessionFactory factory = cfg.buildSessionFactory();
         Session session = factory.openSession();
         Transaction tx = session.beginTransaction();
         
        LibManagement l = new LibManagement();
        l.setmId(1);
        l.setMemName("Joy");
        l.setBtitle("General Knowledge");
        l.setAuthName("Harry Great");
        
        session.save(l);
        tx.commit();
    }
}
