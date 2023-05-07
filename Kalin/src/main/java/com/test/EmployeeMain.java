package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeMain {
public static void main(String[] args) {
	Configuration configuration=new Configuration();
	configuration.configure("hibernate.cgf.xml");
 @SuppressWarnings("deprecation")
SessionFactory sessionFactory=	configuration.buildSessionFactory();
 Session session=sessionFactory.openSession();
Transaction transaction= session.beginTransaction();

Employee employee=new Employee();
employee.setEmpCity("pune");
employee.setEmpName("Hemant");
employee.setEmpNumber("2335456");


session.save(employee);

transaction.commit();
session.close();
System.out.println("insert the data sucessfully");
}
}
