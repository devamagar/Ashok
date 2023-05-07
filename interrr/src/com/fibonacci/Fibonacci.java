package com.fibonacci;

import java.util.Scanner;

public class Fibonacci {
	
public static void main(String[] args) {
	System.out.println("enter the number");
	Scanner scanner=new Scanner(System.in);
      int input= scanner.nextInt();
      int value1 = 0;
      int value2 = 1;
      for (int i = 1; i <= input; i++) {
    	  int  sum = value1 + value2;
      System.out.print(sum + ",");
     
            value1=value2;
            value2=sum;
      }
}
}
