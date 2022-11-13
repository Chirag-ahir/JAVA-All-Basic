package com.miit.basics;
import java.util.Scanner;

public class SumOfN_Ass2 {
	
	static int sum(int n) {
		if(n==0) {
			return n;
		}
		else {
			return(n + sum(n-1));
		}
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range of number you want to add: ");
		number = sc.nextInt();
		System.out.print("The summation of first " + number + " number is: " + sum(number));
	}
}
