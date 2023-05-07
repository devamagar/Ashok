package com.reverse;

public class ReveStr {
	public static void main(String[] args) {
		String string ="devendra";
		String rev="";
		
		int len=string.length();
		
		for(int i=len-1;i>=0;i--) {
			rev=rev+string.charAt(i);
		}
		System.out.println(rev);
	}

}
