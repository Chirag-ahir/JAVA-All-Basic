package com.edureka.polymorphism;

//Static polymorphism(Compile Time Polymorphism) is an example of Method Overloading. 
class Addition{
	
	void sum(int a, int b) {
		int c = a + b;
		System.out.println("Addition of two number is " + c);
	}
	
	void sum(int a, int b, int c) {
		int d = a+b+c;
		System.out.println("Addition of three numbers is " + d);
	}
}

public class StaticPolymorphism{
	public static void main(String[] args) {
		Addition ab = new Addition();
		ab.sum(2, 7);
		ab.sum(2, 3, 4);
	}
}

