import java.util.Scanner;

public class Do_While {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Welcome to number guessing game");
		
		Scanner input = new Scanner(System.in);
		int number = 0;
		do {
			System.out.println("Enter a number: ");
			number = input.nextInt();
		} 
		while (number != 9);
		
		System.out.println("You got 9!");
		
	}
}
