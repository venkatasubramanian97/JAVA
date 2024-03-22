package Collection;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		int n = 5;

		List<Integer> v = new Vector<Integer>(n);

		for (int i = 1; i <= n; i++)
			v.add(i);

		System.out.println(v);

		v.remove(3);

		System.out.println(v);

		for (int i = 0; i < v.size(); i++)

			System.out.print(v.get(i) + " ");
	}
}
//
//output:
//	[1, 2, 3, 4, 5]
//			[1, 2, 3, 5]
//			1 2 3 5 