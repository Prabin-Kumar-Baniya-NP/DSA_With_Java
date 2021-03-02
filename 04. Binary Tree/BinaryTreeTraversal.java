class Node{
	int key;
	Node left, right;

	public Node(int element){
		this.key = element;
	}
}

class BinaryTreeTraversal{
	Node root;

	BinaryTreeTraversal(){
		root = null;
	}
	BinaryTreeTraversal(int element){
		root = new Node(element);
	}

	void preorderTraversal(Node node){
		if (node == null){
			return ;
		}
		// Printing the data of the node
		System.out.print(node.key + " ");

		// recur on left subtree
		preorderTraversal(node.left);

		// recur on right subtree
		preorderTraversal(node.right);
	}
	void inorderTraversal(Node node){
		if (node == null){
			return ;
		}

		// recur on left child
		inorderTraversal(node.left);

		// print node data
		System.out.print(node.key + " ");

		// recur on right child
		inorderTraversal(node.right);
	}
	void postorderTraversal(Node node){
		if (node == null){
			return ;
		}
		// recur on left child
		postorderTraversal(node.left);

		// recur on right child
		postorderTraversal(node.right);

		// print ndoe data
		System.out.print(node.key + " ");
	}

	void preorderTraversal(){
		preorderTraversal(this.root);
	}

	void inorderTraversal(){
		inorderTraversal(this.root);
	}
	void postorderTraversal(){
		postorderTraversal(this.root);
	}

	public static void main(String[] args) {
		BinaryTreeTraversal tree = new BinaryTreeTraversal(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.left.right.left = new Node(6);

		System.out.println("Preorder Traversal");
		tree.preorderTraversal();
		System.out.println("\nInorder Traversal "); 
		tree.inorderTraversal();
		System.out.println("\nPostorder Traversal ");
		tree.postorderTraversal();
	}
}
