package oop;

public class Varargs {
	static int minvalue(int ... value) {
		int min=Integer.MAX_VALUE;
		for(int j:value) {
			if(j<min) {
				min=j;
			}
		}
		return min;
	}
	static char minvalue(char ... value) {
		char min=value[0];
		for(char j:value) {
			if(j<min) {
				min=j;
			}
		}
		return min;
	}
	public static void main(String[] args) {
		//@SuppressWarnings("unused")
		int n=minvalue(7,3,3,4,5);
		System.out.println(n);
		//@SuppressWarnings("unused")
		char  m=minvalue('a','c','f');
		System.out.println(m);
	}

}
