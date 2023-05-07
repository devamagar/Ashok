package com.reverse;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A {
public static void main(String[] args) {
 
  List<String>list=Arrays.asList("sunny","akansha","kajal","anushka");
 List<String> itr=list.stream().sorted().collect(Collectors.toList());
 System.out.println(itr);
}
	
}