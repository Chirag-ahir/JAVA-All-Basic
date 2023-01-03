package com.miit.Super;

//This is a example of Super with method.
class Person{
	void display() {
		System.out.println("This is parant class Method.");
	}
}

class Student extends Person{
	void message() {
		System.out.println("This is student class.");
	}
	void information() {
		message();
		super.display(); //We are calling parant class method
	}
}

public class SuperWithMethod {
	public static void main(String[] args) {
		Student ss = new Student();
		ss.information();
	}
}
