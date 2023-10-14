package com.stuCourse;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Entity.Course;
import com.Entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
         Session session=sessionFactory.openSession();
         
         try {
      	   Course dpt = new Course();
      	   dpt.setName("Front end");
      	   
      	   Student emp1=new Student();
      	   emp1.setName("Krunal");
      	   emp1.setCourse(dpt);
      	   
      	   Student  emp2=new  Student();
      	   emp2.setName("teju");
      	   emp2.setCourse(dpt);
      	   
      	   dpt.getStudent().add(emp1);
      	   dpt.getStudent().add(emp2);
      	   session.beginTransaction();
      	   session.save(dpt);
      	   session.getTransaction().commit();
         }
         finally
         {
      	   session.close();
      	   sessionFactory.close();
         }
    }
}
