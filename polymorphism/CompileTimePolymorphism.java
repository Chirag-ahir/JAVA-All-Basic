package java_polymorphism;
//Compile Time Polymorphism In Java is also known as Static Polymorphism. Compile-Time polymorphism is achieved through Method Overloading.

public class CompileTimePolymorphism {
	
	void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	void sum(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	void sum(double a, double b, double c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		CompileTimePolymorphism CTP = new CompileTimePolymorphism();
		CTP.sum(5, 6);
		CTP.sum(8, 5, 9);
		CTP.sum(8.5, 5.89, 9.21);
	}

}
