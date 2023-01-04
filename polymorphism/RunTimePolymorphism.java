package java_polymorphism;
//Dynamic polymorphism is a process in which a call to an overridden method is resolved at run time. That's why it's called runtime polymorphism. Ex. Method overriding

//superclass
class Car{
	void run() {
		System.out.println("Running");
	}
}

//subclass
class Innova extends Car{
	void run() {
		System.out.println("Running at 120Km");
	}
}


public class RunTimePolymorphism{
	public static void main(String[] args) {
		//Overriding is done by using a reference variable of the superclass. The method to be called is determined based on the object which is being referred to by the reference variable. This is also known as Upcasting.
		Car c = new Innova(); //upcasting
		c.run(); //will call subclass method
	}
}