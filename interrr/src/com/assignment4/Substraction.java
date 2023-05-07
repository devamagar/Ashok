package com.assignment4;

public class Substraction {

	public static int getsub(int a,int b) {
		int c=a-b;
		return c;
		
	}
	public static void main(String[] args) {
		Substraction substraction=new Substraction();
		int d=Substraction.getsub(76, 56);
		System.out.println(d);
	}
}
