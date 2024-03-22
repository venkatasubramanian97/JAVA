package TREE;

public class DEMO {

	public static void main(String[] args) throws NullPointerException {
//		BinaryTree tree=new BinaryTree(10);
//		tree.insertLeft(tree.root,5);
//		tree.insertRight(tree.root,15);
//		tree.insertLeft(tree.root.left,3);
//		tree.insertRight(tree.root.left,8);
//		tree.insertLeft(tree.root.right, 12);
//		BinaryTree.preorder(tree.root);
//		System.out.println("\n");
//		BinaryTree.inorder(tree.root);
//		System.out.println("\n");
//		BinaryTree.postorder(tree.root);	
//
//		Binarysearchtree bst = new Binarysearchtree(50);
//		bst.insert(20);
//		bst.insert(70);
//		bst.insert(10);
//		bst.insert(25);
//		bst.insert(60);
//		bst.insert(90);
//		Binarysearchtree.inorder(bst.root);
//		System.out.println("\n");
//		if (bst.search(bst.root, 9) == null)
//			System.out.println("\nNot Fount");
//		else
//			System.out.println("\nFount");
//
//		bst.delete(10);
//		Binarysearchtree.inorder(bst.root);
	
		AVL bs = new AVL(50);
		bs.insert(20);
		bs.insert(60);
		bs.insert(10);
		bs.insert(30);
		bs.insert(40);
//		bs.insert(90);
		AVL.inorder(bs.root);

		
	}
}
