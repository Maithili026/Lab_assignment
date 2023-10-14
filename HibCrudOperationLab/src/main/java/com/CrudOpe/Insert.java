package com.CrudOpe;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Entity.library;
import com.Utility.HibernateUtil;

public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session ses=HibernateUtil.getSession();
		
		try {
			ses.beginTransaction();
			library l1 = new library("Jiya","Student","Mathematics");
			library l2 = new library("Rohan","employee","DSA");
			library l3 = new library("Rakul","Student","Mathematics");
			library l4 = new library("Deep","employee","DSA");
			ses.save(l1);
			ses.save(l2);
			ses.save(l3);
			ses.save(l4);
			ses.getTransaction().commit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
