package com.assignment6;

public class Multiplefication {
	public void  multiplication (int no) {
		
		for(int a=1; a<=10;a++) {
   
			System.out.println(a*no);
		}
		
}public static void main(String[] args) {
	Multiplefication multiplefication=new Multiplefication();
	multiplefication.multiplication(5);
}
}