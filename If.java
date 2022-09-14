
public class If {
	public static void main(String[] args) {
		
		int amount = 1;
		while (true){
			System.out.println("In the loop");
		
			if(amount == 6){
				break;
			}
			amount++;
		}
		System.out.println("Out of the loop");
		
	}
}
