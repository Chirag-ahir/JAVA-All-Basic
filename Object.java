class Methods {

	String animal;
	int value;

	void run() {
		System.out.println("Running");
		for (int i = 0; i < 4; i++) {
			System.out.println("My " + animal + " is " + value + " years old.");
		}
	}
	
	void talk(String text) {
		System.out.println(text);
	}
	
	void walk(int speed) {
		System.out.println("Walking " + speed + " km per hour");
	}
}

public class Object {

	public static void main(String[] args) {

		Methods name = new Methods();
		name.animal = "Cat";
		name.value = 9;
		name.run();
		
		name.talk("Hello");
		name.walk(23);

	}
}