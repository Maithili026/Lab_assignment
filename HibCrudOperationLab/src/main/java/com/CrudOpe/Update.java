package com.CrudOpe;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Entity.library;
import com.Utility.HibernateUtil;

public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session ses=HibernateUtil.getSession();
		
		try
		{
			ses.beginTransaction();
			library li=ses.get(library.class,2);
			li.setbookName("Ethicak hacking");
		
			ses.getTransaction().commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
