//Deadlock is a situation where multiple threads are waiting for eachother to complete their operation.
public class Deadlock {
	public static void main(String[] args) throws InterruptedException {
		
		String resource1 = "R1";
		String resource2 = "R2";
		
		// thread1 tries to lock resource1 then resource2 
		class ThreadDemo1 implements Runnable {
			public void run() {
				synchronized (resource1) {
					System.out.println("Thread 1: Locked resource1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (resource2) {
						System.out.println("Thread 1: Locked resource2	");
					}
				}
			}
		}

		//thread2 tries to lock resource2 then resource1
		class ThreadDemo2 implements Runnable {
			public void run() {
				synchronized (resource2) {
					System.out.println("Thread 2: Locked resource2");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (resource1) {
						System.out.println("Thread 2: Locked resource1");
					}
				}
			}
		}

		Thread T1 = new Thread(new ThreadDemo1());
		Thread T2 = new Thread(new ThreadDemo2());

		T1.start();
		//T1.join(); //If we use join here than thread1 complete it's execution first and than only thread2 will start it's execution. 
		T2.start();

	}
}
