package MultiThreading;

class Book implements Runnable {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Updating DB");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Num extends Thread {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Example {
	public static void main(String[] args) throws InterruptedException { // main thread
		System.out.println("Hello");
		Runnable vas=()-> {
//			public void run() {
				for (int i = 0; i <= 5; i++) {
					System.out.println("Updating DBefgeg");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
//			}
		};
		Book book = new Book();
		Num num = new Num();
		Thread t1=new Thread(book);
		Thread t2=new Thread(vas);
		t2.start();
		t1.start();
		num.start();
		if(t1.isAlive()) {
			System.out.println("still executive");
		}
		t1.join();
		num.join();
		if(t1.isAlive()) {
			System.out.println("still executive");
		}
		System.out.println("Bye");
	}
}
