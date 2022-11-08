//Implicit conversion is a process of converting Lower datatype into higher one. Other name of this is a Widening type casting.

public class ImplicitConversion{
	public static void main(String[] args){
		int i = 20;
		long l = i;
		float f = l;
		
		System.out.println("Int value "+i);
		System.out.println("Long value "+l);
		System.out.println("Float value "+f);
	}
}