interface Toy{
	void start();
	void run();
}

class Car implements Toy{
	public void start(){
		System.out.printlnCar is startting");
	}
	public void run(){
		System.out.println("Car is running");
	}
}
public class Interface{
	public static void main(String[] args){
		Car cc = new Car();
		cc.start();
		cc.run();
	}
}