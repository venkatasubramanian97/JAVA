package Collection;

import java.util.LinkedList;
import java.util.List;

public class LIteratingElement {

	public static void main(String args[]) {
		List<String> ll = new LinkedList<>();

		ll.add("Geeks");
		ll.add("Geeks");
		ll.add(1, "For");

		for (int i = 0; i < ll.size(); i++) {

			System.out.print(ll.get(i) + " ");
		}

		System.out.println();

		for (String str : ll)
			System.out.print(str + " ");
	}
}

//output:
//	Geeks For Geeks 
//	Geeks For Geeks 