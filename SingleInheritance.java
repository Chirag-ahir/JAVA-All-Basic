package com.miit.basics;

class Simplii{
	void rate1(){System.out.println("Minimum Interest is 3.98");}
}

//When a class inherits another class, it is known as a single inheritance.
class CIBC extends Simplii{
	void rate2(){System.out.println("Minimum Interest is 4.08");}
}

public class SingleInheritance{
	public static void main(String args[]){
		
		CIBC rate = new CIBC();
		rate.rate1();
		rate.rate2();
		

	}
}