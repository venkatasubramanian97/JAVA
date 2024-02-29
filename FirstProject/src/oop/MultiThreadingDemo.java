package oop;

//class Book extends Thread{
//	public void run() {
//		for(int i=1;i<=5;i++) {
//			System.out.println("Updating db");
//			try {Thread.sleep(2000);} catch (InterruptedException e) {}
//		}
//	}
//}
//class Book implements Runnable{
//	public void run() {
//		for(int i=1;i<=5;i++) {
//			System.out.println("Updating db");
//			try {Thread.sleep(2000);} catch (InterruptedException e) {}
//		}
//	}
//}
class Num extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try {Thread.sleep(500);} catch (InterruptedException e) {}
	}
}
}

public class MultiThreadingDemo {

	public static void main(String[] args) throws InterruptedException {
		//Runnable book=new B
		Runnable book=new Runnable()
				{
					public void run() {
						for(int i=1;i<=5;i++) {
							System.out.println("Updating db");
							try {Thread.sleep(2000);} catch (InterruptedException e) {}
						}
					}
				};
//		Runnable book=() ->
//		{
//				for(int i=1;i<=5;i++) {
//					System.out.println("Updating db");
//					try {Thread.sleep(500);} catch (InterruptedException e) {}
//				}
//		};
		Num num=new Num();
		Thread t1=new Thread(book);
//		t1.setName("book1");
//		System.out.println(t1.getName());
		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.getPriority());
//		book.run();
//		num.run();
		t1.start();
		num.start();
//		if(book.isAlive())
//		{
//			System.out.println("true");
//		}
//		book.join();
//		if(book.isAlive())
//		{
//			System.out .println("true");
//		}
		num.join();
		System.out.println("Bye");

	}

}
