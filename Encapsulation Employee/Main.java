
public class Main {

	public static void main(String args[]) {

		Employee vishal = new Employee();
		vishal.setID(101);
		vishal.setName("Vishal Varma");
		vishal.setSalary(120000);

		System.out.println(vishal.getID());
		System.out.println(vishal.getName());
		System.out.println(vishal.getSalary());
	}

}
