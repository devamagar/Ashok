package com.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private int id;
@Column(name="emp_Name")
 private String empName;

 private String empCity;
 private String empNumber;
 
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmpCity() {
	return empCity;
}
public void setEmpCity(String empCity) {
	this.empCity = empCity;
}
public String getEmpNumber() {
	return empNumber;
}
public void setEmpNumber(String empNumber) {
	this.empNumber = empNumber;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", empName=" + empName + ", empCity=" + empCity + ", empNumber=" + empNumber + "]";
}

 
}
