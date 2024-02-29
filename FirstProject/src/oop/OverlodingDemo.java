package oop;

public class OverlodingDemo {

	int max(int a,int b) {
		return a+b;
	}
	int max(int a,int b,int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		OverlodingDemo o=new OverlodingDemo();
		System.out.println(o.max(12,30));
		System.out.println(o.max(1,3,4));
	}
}
	
