package Collection;

import java.util.List;
import java.util.Vector;

public class VAddingElement {

	public static void main(String[] arg) {

		List<Integer> v2 = new Vector<Integer>();

		v2.add(1);
		v2.add(2);
		v2.add(3);

		System.out.println("Vector v2 is " + v2);
	}
}

//output:
//	Vector v2 is [1, 2, 3]
