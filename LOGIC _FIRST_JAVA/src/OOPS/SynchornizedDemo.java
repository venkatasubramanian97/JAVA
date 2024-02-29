package OOPS;

class Table{
	synchronized void printtable(int n) {
		for(int i=1;i<=5;i++) {
			System.out.println(n*i);
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}
}
public class SynchornizedDemo {

	public static void main(String[] args) throws InterruptedException {
		Table t=new Table();
		Thread t1=new Thread() {
			public void run() {
				t.printtable(5);
			}
		};
		Thread t2=new Thread() {
			public void run() {
				t.printtable(10);
			}
		};
		t1.start();
		t2.start();
		if(t1.isAlive()) {
			System.out.println("true");
		}
		t1.join();
		t2.join();
	}

}
