import java.util.Scanner;

public class GetInput {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your line : ");
		String text = input.nextLine();
		System.out.println("Your line is " + text);
		
	}
}
