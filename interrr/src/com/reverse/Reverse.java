package com.reverse;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		int number=scanner.nextInt();
		int orgnumber=number;
		int rev=0;
		while(number!=0) {
			rev=rev*10+number%10;
			number=number/10;		
		}
		if(orgnumber==rev) {
			System.out.println("this is a palindrome number");			
		}else {
			System.out.println("this not palindrome number");
		}
	}
	
}

