package TREE;

public class AVL {
	Node root;

	class Node {
		int key;
		Node left, right;
		int height;

		Node(int val) {
			key = val;
			left = right = null;
			height = 0;
		}
	}

	AVL(int val) {
		root = new Node(val);
	}

	AVL() {
		root = null;
	}

	public int getheight(Node node) {
		if (node == null)
			return -1;
		return node.height;
	}

	public int max(int a, int b) {
		return a > b ? a : b;
	}

	public void insert(int val) {
		root=insert(root, val);
	}

	public Node insert(Node node, int val) {
		if (node == null)
			return new Node(val);
		if (val < node.key)
			node.left = insert(node.left, val);
		else if (val > node.key)
			node.right = insert(node.right, val);
		else
			return node;
		node.height = 1 + max(getheight(node.left), getheight(node.right));

		int balFactor = getBalanceFactor(node);
		// ll case
		if (balFactor > 1 && val < node.left.key) {
			return rightRotate(node);
		}
		// lr case
		if (balFactor > 1 && val > node.left.key) {
			node.left = leftRotate(node.left);
			return rightRotate(node);
		}
		// rr case
		if (balFactor < -1 && val > node.right.key) {
			return leftRotate(node);
		}
		// rl case
		if (balFactor < -1 && val < node.right.key) {
			node.right = rightRotate(node.right);
			return leftRotate(node);
		}
		return node;
	}

	private Node leftRotate(Node z) {
		Node y=z.right;
		Node t3=y.left;
		y.left=z;
		z.right=t3;
		z.height=1+max(getheight(z.left), getheight(z.right));
		y.height=1+max(getheight(y.left), getheight(y.right));
		return y;
	}

	private Node rightRotate(Node z) {
		Node y=z.left;
		Node t3=y.right;
		y.right=z;
		z.left=t3;
		z.height=1+max(getheight(z.left), getheight(z.right));
		y.height=1+max(getheight(y.left), getheight(y.right));
		return y;
	}

	private int getBalanceFactor(Node node) {
		if (node == null)
			return 0;
		return getheight(node.left) - getheight(node.right);
	}

	public static void inorder(Node root) {
		if (root != null) {
			inorder(root.left);
			System.out.print(root.key + "height is :  "+root.height+"\n");
			inorder(root.right);
		}
	}

}
