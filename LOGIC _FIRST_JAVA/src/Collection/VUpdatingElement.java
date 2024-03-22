package Collection;

import java.util.List;
import java.util.Vector;

public class VUpdatingElement {

	public static void main(String args[]) {
		List<Integer> vec_tor = new Vector<Integer>();

		vec_tor.add(12);
		vec_tor.add(23);
		vec_tor.add(22);
		vec_tor.add(10);
		vec_tor.add(20);

		System.out.println("Vector: " + vec_tor);

		System.out.println("The Object that is replaced is: " + vec_tor.set(0, 21));

		System.out.println("The Object that is replaced is: " + vec_tor.set(4, 50));

		System.out.println("The new Vector is: " + vec_tor);
	}
}
//output:
//	Vector: [12, 23, 22, 10, 20]
//			The Object that is replaced is: 12
//			The Object that is replaced is: 20
//			The new Vector is: [21, 23, 22, 10, 50]
