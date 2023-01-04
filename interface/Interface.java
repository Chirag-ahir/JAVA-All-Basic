package java_interface;
import java.util.Scanner;
//interface is a template that has only method declarations and not method implementations. It's way to achieve abstraction.

interface methods {
	public void add();
	public void div();
}

class Calculator implements methods {

	public void add() {
		try (Scanner kb = new Scanner(System.in)) {
			System.out.println("Enter any two integer values to perform addition");
			int a = kb.nextInt();
			int b = kb.nextInt();
			int s = a + b;
			System.out.println("Sum of " + a + " and " + b + " is " + s);
		}
	}

	public void div() {
		try (Scanner kb = new Scanner(System.in)) {
			System.out.println("Enter any two integer values division");
			int a = kb.nextInt();
			int b = kb.nextInt();
			int s = a / b;
			System.out.println("Quotient of " + a + " and " + b + " is " + s);
		}
	}
}

public class Interface {
	public static void main(String[] args) {
		Calculator CC = new Calculator(); // ref object CC of class Calculator
		CC.add();
		CC.div();
	}
}

/*
==points to remember==
A class that implements the interface must provide an implementation for all methods declared in the interface.
All methods in an interface are internally public abstract void.
All variables in an interface are internally public static final.
Classes do not extend but implement interfaces.
None of the methods declared in the interface has a body that makes it provide complete abstraction.
It is not possible to create an object of an interface. Hence, the Instantiation of an Interface is not possible.
*/