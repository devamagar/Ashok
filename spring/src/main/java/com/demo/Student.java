package com.demo;

public class Student {
 private String name;
 private String city;
 private String number;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
@Override
public String toString() {
	return "Student [name=" + name + ", city=" + city + ", number=" + number + "]";
}
 
}
