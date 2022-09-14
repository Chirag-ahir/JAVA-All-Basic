import java.util.Scanner;

public class Switch {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		while(true) {
			
			Scanner input = new Scanner(System.in);
			System.out.print("Enter your instruction: ");
			String text = input.nextLine();

			switch (text) {
			case "run":
				System.out.println("Your program is runing.");
				break;
			case "stop":
				System.out.println("Your program is stopped.");
				break;
			default:
				System.out.println("Please provide valid instruction.");
			}
			
		}
		
	}
}
