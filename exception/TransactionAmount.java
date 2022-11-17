package com.miit.exception;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TransactionAmount {
	
	public int TnxAmount(String value) {
		int amount = Integer.parseInt(value);
		System.out.print("Your transaction amount is:");
		return amount;
	}
	
	//DivideByZero error
	public int TnxRate(int value1, int value2) {
		int rate = value1/value2;
		System.out.print("Your rate is: ");
		return rate;
	}
	
	//IndexOutOfBound exception
	public void customers() {
		ArrayList<String> Customer = new ArrayList<>();
		Customer.add("Sanket");
		Customer.add("Asit");
		Customer.add("Swati");
		try {
			System.out.print(Customer.get(3));
		}catch(IndexOutOfBoundsException e){
			System.out.println("IndexOutOfBoundsException caught! Array index out of bound");
		}
	}
	
	//Null pointer exception 
	String name;
	public void identification(String value) {
		this.name = value; 
		System.out.println(name.toString());
	}
	
	//IOException
	public void customerFile(){
		try {
			FileReader fileReader = new FileReader("Test.txt");
		    System.out.println(fileReader.read());
		    fileReader.close();
		} catch (IOException e) {
			System.out.println("FileNotFoundException caught! IOException error");
			e.getMessage();
		}
	}
	
	//Throw keyword
	public void TnxLimit(double WithdrawAmount) throws ArithmeticException{
		if(WithdrawAmount > 10000.00) {
			throw new ArithmeticException("You exceed your today's withdrawal limit");
		}else {
			System.out.println("Please wait. We are dispatching your money.");
		}
	}
}
