//This is a example of Super with Variable
package com.miit.Super;

class Vehicle{
	int maxSpeed = 150;
}

class Car extends Vehicle{
	int maxSpeed = 100;
	
	void display() {
		System.out.print("Max speed of car is: " + super.maxSpeed);
	}
}
public class SuperWithVar {
	public static void main(String[] args) {
		
		Car cc = new Car();
		cc.display();
	}
}
