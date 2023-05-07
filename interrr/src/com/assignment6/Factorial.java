package com.assignment6;

public class Factorial {
	public static int getfactorial(int no) {
		int fact=1;
		for(int i=1;i<=no;i++) {
			fact=fact*i;
		}	
		return fact;
		
	}public static void main(String[] args) {
		Factorial factorial=new Factorial();
	   int result=	factorial.getfactorial(5);
		System.out.println(result);
	}

}
