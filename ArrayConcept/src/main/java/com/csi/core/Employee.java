package com.csi.core;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Con1{
	private String name;
	private int id;
	private double salary;
	private int age;
	public Con1(String name, int id, double salary, int age) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.age = age;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Con [name=" + name + ", id=" + id + ", salary=" + salary + ", age=" + age + "]";
	}
	
	
	
	
}

public class Employee {
	public static void main(String[] args) {
		List<Con1>cons=new ArrayList<Con1>();
		
		cons.add(new Con1("aarushi", 1, 4567.8, 23));
		cons.add(new Con1("viruska", 2, 34567.9, 21));
		cons.add(new Con1("vaani", 3, 1234.6, 22));
		//System.out.println(cons);
		/*
		 * for (Con1 con1 : cons) { System.out.println(con1);
		 * 
		 * }
		 */
		cons.stream().filter(con->con.getSalary()>=5000).forEach(System.out::println);
		cons.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).forEach(System.out::println);
	
	}
	
}



