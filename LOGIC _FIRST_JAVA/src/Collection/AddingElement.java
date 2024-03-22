package Collection;

import java.util.ArrayList;
import java.util.List;

public class AddingElement {

	public static void main(String args[]) {
		
		List<String> al = new ArrayList<>();

		al.add("Geeks");
		al.add("Geeks");

		al.add(1, "For");

		System.out.println(al);
	}
}

//output:
//	[Geeks, For, Geeks]
