//import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {
//		LinkedList<Integer> list = new LinkedList<Integer>();
//		list.insertAtBeginning(10);
//		list.insertAtBeginning(5);
//		list.insertAtBeginning(1);
//
//		for (int a : list) {
//			System.out.print(a + " ");
//		}
//		System.out.println("\n");
//
//		list.insertAtPos(2, 20);
//		list.insertAtPos(3, 30);
//
//		for (int a : list) {
//			System.out.print(a + " ");
//		}
//		System.out.println("\n");
//
//		list.insertAtEnd(50);
//		list.insertAtEnd(100);
//
//		for (int a : list) {
//			System.out.print(a + " ");
//		}
//		System.out.println("\n");
//
//		list.deleteAtfirst();
//
//		for (int a : list) {
//			System.out.print(a + " ");
//		}
//		System.out.println("\n");
//
//		list.deleteAtPos(2);
//
//		for (int a : list) {
//			System.out.print(a + " ");
//		}
//		System.out.println("\n");
//
//		list.deleteAtEnd();
//		list.deleteAtEnd();
//
//		Iterator<Integer> it = list.iterator();
//		while (it.hasNext()) {
//			System.out.print(it.next() + " ");
//		}
//		System.out.println("\n");
//
//		list.insertAtEnd(200);
//		list.insertAtBeginning(111);
//
//		for (int a : list) {
//			System.out.print(a + " ");
//		}
//		System.out.println("\n");
//
//		list.reverse();
//		for (int a : list)
//			System.out.print(a + " ");
//		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
//		list.insertAtBeginning(10);
//		list.insertAtBeginning(5);
//		list.insertAtBeginning(1);
//
//		list.display();
//		System.out.println("\n");
//		list.displayrev();
//
//		list.insertAtPos(3, 100);
//		System.out.println("\n");
//		list.display();
//		System.out.println("\n");
//		list.displayrev();
//
//		list.deleteAtPos(1);
//		System.out.println("\n");
//		// list.display();
//
//		Iterator<Integer> it = list.iterator();
//		while (it.hasNext()) {
//			System.out.print(it.next() + " ");
//		}
//		System.out.println("\n");
//		list.displayrev();

		CircularLinkedList<String> list = new CircularLinkedList<String>();
		list.insertAtBegnning("vasu");
		list.insertAtBegnning("manjula");
		list.insertAtBegnning("venkadesh");
		list.display();
		System.out.println("\n");
		list.insertAtEng("vasanth");
		list.display();
		System.out.println("\n");
		list.deleteAtbegnning();
		list.display();
		System.out.println("\n");
		list.deleteAtEnd();
		list.display();
	}

}
