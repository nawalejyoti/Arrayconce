package com.csi.core;

public class StringReverse {
public static void main(String[] args) {
	String name= "jyoti";
	char c []=name.toCharArray();
	char b;
	for (int i = c.length; i>0; i--) {
		b=c[i];
		System.out.print(b);
	}
	
	
}
}
