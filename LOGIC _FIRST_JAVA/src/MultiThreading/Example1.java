package MultiThreading;

class Table{
	synchronized void printTable(int n) {
		for(int i=0;i<=5;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class Example1 {
	public static void main(String[] args) {
		Table t=new Table();
		
		Thread t1=new Thread() {
			public void run() {
				t.printTable(5);
			}
		};
		Thread t2=new Thread() {
			public void run() {
				t.printTable(10);
			}
		};
		t1.start();
		t2.start();
	}

}
