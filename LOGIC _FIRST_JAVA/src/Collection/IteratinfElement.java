package Collection;

import java.util.ArrayList;
import java.util.List;

public class IteratinfElement {

	public static void main(String args[]) {
		List<String> al = new ArrayList<>();

		al.add("Geeks");
		al.add("Geeks");
		al.add(1, "For");

		for (int i = 0; i < al.size(); i++) {

			System.out.print(al.get(i) + " ");
		}

		System.out.println();

		for (String str : al)
			System.out.print(str + " ");
	}
}

//output:
//	Geeks For Geeks 
//	Geeks For Geeks 