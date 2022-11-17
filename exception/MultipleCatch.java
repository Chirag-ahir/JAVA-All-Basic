package com.miit.exception;

public class MultipleCatch {
	public static void main(String[] args) {

		String s = "The quick brown fox climb on tree";
		int a[] = new int[4];

		try {
//			s = null;
			a[3] = 20/0;
			int sLength = s.length();
			System.out.println("String length: " + sLength);
			System.out.println(a[6]);
		} catch (ArithmeticException ae) {
			System.out.println("A number cannot be divided by zero, Illegal operation in java");
		} catch (NullPointerException npe) {
			System.out.println("Exception is caught! " + npe.getMessage());
		} catch (ArrayIndexOutOfBoundsException aie) {
			System.out.println("Exception is caught! " + aie.getMessage());
		}

	}

}
