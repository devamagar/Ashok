package com.assignment5;

public class LeafYear {
public static void main(String[] args) {
	

	int year = 2023;
	
	if(((year % 4 == 0) && (year % 100 != 0)) ||
	 (year % 400 == 0)) {
	System.out.println("its leap year");
	}else {
	System.out.println("its not leap year");
	}
}
}
