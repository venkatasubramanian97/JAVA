package Collection;

import java.util.ArrayList;
import java.util.List;

public class GetElement {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		// add the number
		list.add(9);
		list.add(5);
		list.add(6);
		System.out.println(list);
		// get method
		Integer n = list.get(1);
		System.out.println("at indext 1 number is:" + n);
	}
}

//output:
//	[9, 5, 6]
//			at indext 1 number is:5
