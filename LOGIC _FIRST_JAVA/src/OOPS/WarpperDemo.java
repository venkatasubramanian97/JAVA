package OOPS;

public class WarpperDemo {
	public static void main(String[] args) {
		int i = 10;// primitive data types
		Integer i2 = Integer.valueOf(i);// boxing,wrapping
		int j = i2.intValue();// unboxing
		System.out.println(j);
		Integer i3 = 20;
		int k = i3;
		System.out.println(k);
		String s = "123";
		int c = Integer.parseInt(s);
		System.out.println(c);
		short j1 = 100;
		System.out.println(j1);
	}

}
