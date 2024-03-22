package Collection;

import java.util.ArrayList;
import java.util.List;

public class ChangingElement {

	public static void main(String args[]) {

		List<String> al = new ArrayList<>();

		al.add("Geeks");
		al.add("Geeks");

		al.add(1, "Geeks");

		System.out.println("Initial ArrayList " + al);

		al.set(1, "For");
		
		System.out.println("Updated ArrayList " + al);
	}
}

//output:
//	Initial ArrayList [Geeks, Geeks, Geeks]
//			Updated ArrayList [Geeks, For, Geeks]
