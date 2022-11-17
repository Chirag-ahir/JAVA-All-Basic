package car_interface;

class Audi implements MainCar {
	int speed = 0;
	int gear = 1;

	@Override
	public void speedUp(int increment) {
		speed = speed + increment;
	}

	@Override
	public void applyBrakes(int decrement) {
		speed = speed - decrement;
	}

	@Override
	public void changeGear(int value) {
		gear = value;
	}

	void printStates() {
		System.out.println("speed:" + speed + " gear:" + gear);
	}
}

public class ChildCar {
	public static void main(String[] args) {
		Audi A6 = new Audi();
		A6.speedUp(50);
		A6.printStates();
		A6.changeGear(4);
		A6.speedUp(100);
		A6.printStates();
	}
}