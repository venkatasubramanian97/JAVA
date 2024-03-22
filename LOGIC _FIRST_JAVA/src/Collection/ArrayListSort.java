package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSort {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(4);
		list.add(3);
		list.add(1);
		System.out.println("Before sorting list:");
		System.out.println(list);
		Collections.sort(list);
		System.out.println("after sorting list:");
		System.out.println(list);
	}
}

//output:
//	Before sorting list:
//		[2, 4, 3, 1]
//		after sorting list:
//		[1, 2, 3, 4]
