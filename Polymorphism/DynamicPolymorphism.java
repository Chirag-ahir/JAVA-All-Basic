package com.edureka.polymorphism;

//Dynamic polymorphism(Run Time polymorphism) is an example of Method Overriding

//Vehicle is superclass or parant class
class Vehicle{
	void run() {
		System.out.println("Car is moving.");
	}
}

//car is a subclass or chid class
class Car extends Vehicle{
	void run() {
		System.out.println("Car is moving");
	}
}

public class DynamicPolymorphism {
	public static void main(String[] args) {
		Car cc = new Car();
		cc.run();
	}
}
