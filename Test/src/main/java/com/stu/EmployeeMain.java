package com.stu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeMain {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		
		Employee emp = new Employee();
		emp.setEmpName("Sunnu");
		emp.setEmpCity("Hyd");
		emp.setEmpNumber("234567");
		
		session.save(emp);
		t.commit();
		session.close();
		System.out.println("Record saved successfully.");
	}
}
