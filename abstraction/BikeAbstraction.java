package com.miit.abstraction;

//abstract method not have implementation
abstract class Bike{
	abstract void run();
}

class Honda extends Bike{
	public void run() {
		System.out.println("Honda bike is running");
	}
}

public class BikeAbstraction {
	public static void main(String[] args) {
		Honda H = new Honda();
		H.run();
	}
}
