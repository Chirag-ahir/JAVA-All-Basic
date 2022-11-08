//Eexplicit type conversion is a process of converting Higher datatype into lower one. Other name of this is a Narrowing typecasting

public class ExplicitConversion{
	public static void main(String[] args)
	{
		double d = 200.06;
		long l = (long)d;
		int i = (int)l;
		
		System.out.println("Double Data type value "+d);
		System.out.println("Long Data type value "+l);
		System.out.println("Int Data type value "+i);
	}
}