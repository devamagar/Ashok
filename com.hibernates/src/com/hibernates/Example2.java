package com.hibernates;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Example {

	public static void main(String[] args) {
		
		
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
		Session session=sessionFactory.openSession();

        Transaction transaction=session.beginTransaction();
		
		Student student=new Student();
		student.setName("amit");
		student.setCity("pune");
		student.setNumber("9657555");
		
		session.save(student);
		session.close();
		System.out.println("record is inserted");
	}

}
