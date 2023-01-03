package com.miit.iib;
//Instance Initializer block is used to initialize the instance data member. It run each time when object of the class is created.

public class InstanceInilizerBlock {
	
	public InstanceInilizerBlock() {
		System.out.println("Constructor is invoked");
	}
	
	{System.out.println("InstanceInilizerBlock invoked");} //IIB block
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		InstanceInilizerBlock IIB = new InstanceInilizerBlock(); //IIB called when object of class is created
	}

}
