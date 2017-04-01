package multithreading;

public class MulThread1 extends Thread {
	public void run() {
		System.out.println("Thread is running");
	}

	public static void main(String[] args) {
		MulThread1 m1 = new MulThread1();
		m1.start();
	}
}
