package com.miit.Super;

class Parant {
    Parant(){
        System.out.println("Parant class Constructor");
    }
}

class Child extends Parant {
    Child(){
        super(); //We are calling parant class constructor
        System.out.println("Child class Constructor");
    }
}
 

public class SuperWithConstructor {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Child cc = new Child();
	}
}
