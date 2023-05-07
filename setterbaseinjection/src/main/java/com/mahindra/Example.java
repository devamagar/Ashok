package com.mahindra;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example {
	public static void main(String[] args) {
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
	
	 Student student=(Student) applicationContext.getBean("s");
	student.getmassagedetails("sachin");
	}

}
