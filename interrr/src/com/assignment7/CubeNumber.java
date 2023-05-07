package com.assignment7;

import java.util.Scanner;

public class CubeNumber {
	public int getNumberCube(int num) {
		int cube=num*num*num;
		
		return cube;
	}public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		int cb=scanner.nextInt();
		
		CubeNumber cubeNumber=new CubeNumber();
		int cbc=cubeNumber.getNumberCube(cb);
		System.out.println(cbc);
	}
	
}
