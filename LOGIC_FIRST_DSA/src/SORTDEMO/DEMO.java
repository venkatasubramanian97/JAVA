package SORTDEMO;

import java.util.Arrays;

public class DEMO {

	public static void main(String[] args) {

		int s_array[] = { 10, 15, 4, 9, 23 };
		SelectionSort.sort(s_array);
		System.out.print(Arrays.toString(s_array));
		System.out.println("\n");

		int b_array[] = { 1, 15, 4, 55, 23 };
		BubbleSort.bubble(b_array);
		System.out.print(Arrays.toString(b_array));
		System.out.println("\n");

		int i_array[] = { 1, 15, 0, 9, 20, 4, 55, 23 };
		InsertionSort.insertion(i_array);
		System.out.print(Arrays.toString(i_array));
		System.out.println("\n");

		int m_array[] = { 1, 15, 4, 55, 23 };
		System.out.print(Arrays.toString(MergeSort.merge(m_array)));
		System.out.println("\n");
		
		int m1_array[] = { 1, 15, 0, 9, 20, 4, 55, 23 };
		MergeSort.sort1(m1_array,0,m1_array.length);
		System.out.print(Arrays.toString(m1_array));
		System.out.println("\n");

		int[] q_array = { 5, 8, 4, 3, 7, 6, 2, 9, 5 };
		QuickSort.quick(q_array, 0, q_array.length - 1);
		System.out.print(Arrays.toString(q_array));
	}

}
