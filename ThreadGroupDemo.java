class ThreadDemo implements Runnable {
	public void run() {
		System.out.println("Current Thread name: " + Thread.currentThread().getName());
	}
}

class ThreadGroupDemo {
	public static void main(String[] args) {

		ThreadGroup TG1 = new ThreadGroup("Parant Group");
		ThreadGroup TG2 = new ThreadGroup(TG1, "Child Group");

		Thread T1 = new Thread(TG1, new ThreadDemo(), "one");
		Thread T2 = new Thread(TG1, new ThreadDemo(), "two");
		Thread T3 = new Thread(TG1, new ThreadDemo(), "three");

		Thread T4 = new Thread(TG2, new ThreadDemo(), "four");
		Thread T5 = new Thread(TG2, new ThreadDemo(), "five");

		T1.start();
		T2.start();
		T3.start();
		T4.start();
		T5.start();

		System.out.println("Active threadgroup: " + TG1.activeCount());

		TG1.list();
		TG2.list();

		System.out.println("First group name: " + TG1.getName());
		System.out.println("Second group name: " + TG2.getName());
	}
}
