package com.assignment7;

import java.util.Scanner;

public class FactorNumber {
	public static void getFactors(int number) {
		int a=1;
		while(a<=number) {
			
			if(number%a==0) {
				System.out.println(a);	
			}
			
			a++;
		}
		}
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter the number");
		int res=scanner.nextInt();
		
		FactorNumber factorNumber= new FactorNumber();
		
		System.out.println(res);
		FactorNumber.getFactors(res);
		
		
	}

}
