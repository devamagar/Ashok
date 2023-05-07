package com.array;

import java.util.Arrays;

public class CompareToArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]= {1,2,8,4};
		
	boolean c=	Arrays.equals(a, b);
	if(c==true) {
		System.out.println("its equal");
	}
		else {
			System.out.println("its not equals");
		}
	}
	
	}


