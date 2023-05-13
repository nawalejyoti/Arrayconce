package com.csi.core;

import java.util.Arrays;

public class NumberWithoccurance {
	public static void main(String[] args) {
		String name= "Shraddha";
		char str[]=name.toLowerCase().toCharArray();
		Arrays.sort(str);
		for (int i = 0; i < str.length; i++) {    
			int count=1;
			char temp=str[i];
			for (int j = i+1; j < str.length; j++) {
				if(str[i]==str[j]) {
					count ++;
					i++;
					
				}
				
				
				}
			if (count>1) {
				System.out.println(temp +"="+count);
			}
			
		}
		
	}

}



