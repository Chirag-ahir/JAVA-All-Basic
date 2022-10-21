package com.miit.encapsulation;

public class TestEncapsulation{
	public static void main(String args[]) {
		Person obj = new Person();
		
		obj.setName("prashant");
		obj.setAge(20);
		obj.setSalary(40000);
		
		System.out.println("Name of the person is: " + obj.getName());
		System.out.println("Age of the person is: " + obj.getAge());
		System.out.println("Salary of the person is: " + obj.getSalary());
		
	}
}

