package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2); // Create a thread pool with 2 threads

		for (int i = 0; i < 5; i++) {
			Runnable worker = new MyRunnable("" + i);
			executor.execute(worker); // Submitting tasks to the executor
		}

		executor.shutdown(); // Shutdown the executor after use
	}
}

class MyRunnable implements Runnable {
	private String command;

	public MyRunnable(String s) {
		this.command = s;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " Start. Task = " + command);
		processCommand();
		System.out.println(Thread.currentThread().getName() + " End.");
	}

	private void processCommand() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
