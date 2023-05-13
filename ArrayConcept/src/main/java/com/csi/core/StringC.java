package com.csi.core;

import java.util.Arrays;

public class StringC {
	public static void main(String[] args) {
		String name="Avantika";
		char str[]=name.toLowerCase().toCharArray();
		Arrays.sort(str);
		System.out.println(str);
		for (int i = 0; i < str.length; i++) {
			int count =1;
			char temp=str[i];
			for (int j = i+1; j < str.length; j++) {
				if (str[i]==str[j]) {
					i++;
					count++;
					
				}
				
			}
				//if (count>1) {
					System.out.println(temp+":"+count);
				


			//}
			
		}
		
	}

}
