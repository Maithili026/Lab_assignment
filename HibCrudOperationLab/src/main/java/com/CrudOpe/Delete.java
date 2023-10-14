package com.CrudOpe;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Entity.library;
import com.Utility.HibernateUtil;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				SessionFactory factory=HibernateUtil.getSessionFactory();
				Session ses=HibernateUtil.getSession();
				
				try
				{
					ses.beginTransaction();
					library a1=ses.get(library.class,2);
					ses.delete(a1);
				
					ses.getTransaction().commit();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			
			}

}
