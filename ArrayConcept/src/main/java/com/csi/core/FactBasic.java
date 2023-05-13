package com.csi.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FactBasic {
	public static void main(String[] args) {
	List<Integer>emp=new ArrayList<Integer>();
	emp.add(4);
	emp.add(6);
	emp.add(45);
	emp.add(76);
	emp.add(9);
	System.out.println(emp);
	int max=emp.stream().sorted().collect(Collectors.toList()).get(1);
	System.out.println(max);
	List<String>nameList=List.of("ac","hy","ase");
	String salString=nameList.stream().sorted().collect(Collectors.toList()).get(0);
	
	 
	}	
}
