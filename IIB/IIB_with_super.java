package com.miit.iib;
//The instance initializer block is invoked after the parent class constructor is invoked 

class A {
	A() {
		System.out.println("parent class constructor invoked");
	}
}

class B2 extends A {
	B2() {
		super();
		System.out.println("child class constructor invoked");
	}

	{
		System.out.println("instance initializer block is invoked");
	}

}

public class IIB_with_super {
	@SuppressWarnings("unused")
	public static void main(String args[]) {
		B2 b = new B2();
	}
}
