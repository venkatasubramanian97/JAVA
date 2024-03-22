package OOPS;
import java.util.*;
public class Recursion {
	static int fact(int n) {
		if(n==0)
			return 1;
		return n*fact(n-1);
	}
	static int added(int n) {
		if(n==0)
			return 0;
		return n+added(n-1);
	}

	public static void main(String[] args) {
		int n=5;
		@SuppressWarnings("resource")
		Scanner Recur = new Scanner(System.in);
		n=Recur.nextInt();
		System.out.println(fact(n));
		System.out.println(added(n));
	}

}
