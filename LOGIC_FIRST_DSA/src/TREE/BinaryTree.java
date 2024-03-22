package TREE;

public class BinaryTree {
	Node root;

	class Node {
		int data;
		Node left, right;

		Node(int val) {
			data = val;
			left = right = null;
		}
	}

	public BinaryTree(int d) {
		root = new Node(d);
	}

	public void insertLeft(Node l, int val) {
		Node newnode = new Node(val);
		l.left = newnode;
	}

	public void insertRight(Node l, int val) {
		Node newnode = new Node(val);
		l.right = newnode;
	}

	public static void preorder(Node root) {
 		if (root != null) {
			System.out.print(root.data + " ");
			preorder(root.left);
			preorder(root.right);
		}
	}

	public static void inorder(Node root) {
		if (root != null) {
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}
	}

	public static void postorder(Node root) {
		if (root != null) {
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data + " ");
		}
	}
}
