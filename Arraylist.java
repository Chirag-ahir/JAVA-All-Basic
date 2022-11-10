package com.miit.basics;
import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args) {
		
		ArrayList<String> food= new ArrayList<String>();
		
		food.add("Pizza");
		food.add("Burger");
		food.add("Burrito");
		
		for(int i=0; i<=food.size(); i++) {
			System.out.println(food.get(i));
		}
		

	}
}
