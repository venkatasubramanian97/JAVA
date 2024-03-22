package TREE;

public class Binarysearchtree {
	Node root;

	class Node {
		int key;
		Node left, right;

		Node(int val) {
			key = val;
			left = right = null;
		}
	}

	Binarysearchtree(int val) {
		root = new Node(val);
	}

	public void insert(int val) {
		insert(root, val);
	}

	public Node insert(Node root, int val) {
		if (root == null)
			return new Node(val);
		if (val < root.key)
			root.left = insert(root.left, val);
		else
			root.right = insert(root.right, val);
		return root;
	}

	public static void inorder(Node root) {
		if (root != null) {
			inorder(root.left);
			System.out.print(root.key + " ");
			inorder(root.right);
		}
	}

	public Node search(Node root, int val) throws NullPointerException {
		if (root == null)
			return null; // Return null if root is null
		if (root.key == val)
			return root; // Return root if the value is found at the current node
		if (val < root.key)
			return search(root.left, val); // Search in the left subtree
		else
			return search(root.right, val); // Search in the right subtree
	}

	public void delete(int val) {
		root = delete(root, val);
	}

	public Node delete(Node root, int val) {
		if (root == null)
			return root;
		if (val < root.key)
			root.left = delete(root.left, val);
		else if (val > root.key)
			root.right = delete(root.right, val);
		else {
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;
			root.key = min(root.right);
			root.right = delete(root.right, root.key);
		}
		return root;
	}

	public int min(Node root) {
		int minval = root.key;
		while (root.left != null) {
			minval = root.left.key;
			root = root.left;
		}
		return minval;
	}
}
