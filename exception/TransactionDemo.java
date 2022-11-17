package com.miit.exception;

public class TransactionDemo {

	public static void main(String[] args) {

		// Creating instance of TransactionAmount class
		TransactionAmount TL = new TransactionAmount();

		// Number format exception error
		try {
			System.out.println(TL.TnxAmount("12a"));
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException caught! Not a valid number");
		} finally {
			System.out.print(TL.TnxAmount("123"));
		}

		System.out.println();

		// Arithmetic exception error
		try {
			System.out.println(TL.TnxRate(23, 0));
			System.out.println(TL.TnxRate(24, 12));
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException caught! Divide By Zero");
		}

		// ArrayOutOfBound exception
		TL.customers();

		// NullPointer exception
		try {
			TL.identification("Reets");
			TL.identification(null);
		} catch (NullPointerException e) {
			System.out.println("NullPointerException caught! String can't be null");
			System.out.println(e.getMessage());
		}

		// IOExeption
		TL.customerFile();

		// ClassNotFound exception
		try {
			Class.forName("com.journaldev.MyInvisibleClass");

			ClassLoader.getSystemClassLoader().loadClass("com.journaldev.MyInvisibleClass");

			ClassLoader.getPlatformClassLoader().loadClass("com.journaldev.MyInvisibleClass");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// Throw exception
		TL.TnxLimit(900);
		TL.TnxLimit(12000);
	}

}
