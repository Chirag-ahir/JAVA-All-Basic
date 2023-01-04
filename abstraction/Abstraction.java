package java_abstraction;

//abstract class
abstract class SuperClass {
	// abstract method
	public abstract void showMsg();
}

class SubClass extends SuperClass {
	// implementation of abstract method
	public void showMsg() {
		System.out.println("Overriding the abstract method of the super class");
	}
}

public class Abstraction {
	public static void main(String[] args) {
		SubClass SC = new SubClass(); 
		SC.showMsg();
	}
}


/*
==points to remember==
you can not create an object from the abstract class using the new operator.
an abstract class can have a constructor
abstract class can contain both abstract as well as concrete methods.
only classes or methods can be declared as abstract, we can not declare a variable as abstract.
we use the keyword abstract to declare both class and method as abstract.
If we declare any method as abstract, the class automatically needs to become an abstract class.
*/