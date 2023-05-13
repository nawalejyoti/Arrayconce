package com.csi.core;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Features {
public static void main(String[] args) {
	List<Integer> list2=new ArrayList<Integer>();
	list2.add(3);
	list2.add(5);
	list2.add(10);
	list2.add(22);
	System.out.println(list2);
	List<Integer>newlist=list2.stream().filter(i->i>=10).collect(Collectors.toList());
	System.out.println(newlist);
	
	}
}
