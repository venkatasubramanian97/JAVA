package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetExample {

		public static void main(String[] args) 
		{ 
			@SuppressWarnings("rawtypes")
			HashSet<ArrayList> set = new HashSet<>(); 

			ArrayList<Integer> list1 = new ArrayList<>(); 

			ArrayList<Integer> list2 = new ArrayList<>(); 

			list1.add(1); 
			list1.add(2); 
			list2.add(1); 
			list2.add(2); 
			set.add(list1); 
			set.add(list2); 

			System.out.println("Hashset size of the set : "+set.size()); 
		} 
	}

//output:
//	Hashset size of the set : 1
