package com.hello;

import java.util.Arrays;

public class Hello {

public static void main(String[] args) {

int a[]= {1,2,3,4};
int b[]= {1,2,3,4};
boolean var=Arrays.equals(a, b);
if (var ==true) {
	System.out.println("its equal");
	{
		System.out.println("its not equal");
	}
}

}
}
