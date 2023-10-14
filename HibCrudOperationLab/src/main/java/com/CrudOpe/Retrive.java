package com.CrudOpe;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Entity.library;
import com.Utility.HibernateUtil;

public class Retrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session ses=HibernateUtil.getSession();
		
		try {
			ses.beginTransaction();
			library lb = ses.get(library.class,1);
	
		    System.out.println("emp with id 1 info"+lb);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}