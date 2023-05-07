package com.array;

public class SecondHighestNo {
	public static void main(String[] args) {
		int a[]= {45,86,78};
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if (a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		System.out.println(a[1]);
	}
}
