package com.csi.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.w3c.dom.stylesheets.LinkStyle;

public class ReverseNumbers {

	public static void main(String[] args) {
		List<Double> list = new ArrayList<Double>();
		list.add(344.9);
		list.add(289.9);
		list.add(921.9);
		list.add(344.9);
		List<Double> list2 =  list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(list2);
		
		List<String> list1 = List.of("abc","grfe","fef","er");
		List<String> str = list1.stream().sorted().collect(Collectors.toList());
		String str1 = list1.stream().sorted().collect(Collectors.toList()).get(1);
        System.out.println(str);
        System.out.println(str1);
	}
}
