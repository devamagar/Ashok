package com.assignment7;

import java.util.Scanner;

public class ReversNumber {
	public static void main(String[] args) {
		
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("enter the number");
		 int num= scanner.nextInt();
		 
		 int rev=0;
	      
		  while(num!=0) {
			  
			  rev= rev*10+num%10;
			  num=num/10;
			  
			 
		  }
		 
		  System.out.println(rev);
	}
}
