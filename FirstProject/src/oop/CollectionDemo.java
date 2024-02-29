package oop;
import java.util.*;
public class CollectionDemo {

	public static void main(String[] args) {
//		ArrayList<Integer> alist=new ArrayList<Integer>();
//		
//		for(int i=1;i<=10;i++)
//			alist.add(i);
//		alist.add(100);
//		alist.add(200);
//		alist.add(300);
//		System.out.println(alist);
//		System.out.println(alist.get(2));
//		alist.set(0, 10);
//		alist.remove(2);
//		System.out.println(alist);
////		if(alist.contains(100))
////		System.out.println("true");
//		for(int i:alist) {
//			System.out.println(i);
//		}
//		Iterator<Integer> i=alist.iterator();
//		System.out.println("Using Iterator");
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
		//queueDemo
		//Queue<Integer> q=new LinkedList<Integer>();
//		PriorityQueue<Integer> q=new PriorityQueue<>();
//		q.add(3);
//		q.add(10);
//		q.add(1);
//		q.add(8);
//		System.out.println("Head is : "+q.peek());
//		//System.out.println("Remove is : "+q.remove());
//		System.out.println("remove is : "+q.poll());
//		System.out.println("Head is : "+q.peek());
		
		//setdemo
		//LinkedHashSet<String> q=new LinkedHashSet<String>();
		TreeSet<String> q=new TreeSet<String>();
		q.add("vasu");
		q.add("venkadesh");
		q.add("manjula");
		q.add("subrmanian");
		q.add("venkadesh");
		System.out.println(q);
	}
}