package com.array;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		int a[]= {1,4,6,3,8,};
		Arrays.parallelSort(a);
		System.out.println(Arrays.toString(a));
	}

}
