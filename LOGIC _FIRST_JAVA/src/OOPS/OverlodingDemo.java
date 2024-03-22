package OOPS;

public class OverlodingDemo {

	static int max(int a,int b) {
		return a+b;
	}
	static int max(int a,int b,int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		//OverlodingDemo o=new OverlodingDemo();
		System.out.println(max(12,30));
		System.out.println(max(1,3,4));
	}
}
	
