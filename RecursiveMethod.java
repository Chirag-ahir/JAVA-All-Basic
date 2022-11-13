//Recursion in java is a process in which a method calls itself continuously. A method in java that calls itself is called recursive method.

package com.miit.basics;

public class RecursiveMethod {
	
	private static void sayHi(int count) {
		System.out.println("Hello there. This is Java!");
		
		//Basecase
		if(count <= 1) {
			return;
		}
		sayHi(count - 1);
	}

	public static void main(String[] args) {
		sayHi(6);
	}

}
