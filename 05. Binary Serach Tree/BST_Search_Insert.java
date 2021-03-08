class Node{
	int key;
	Node left, right;

	public Node(int element){
		key = element;
		left = right = null;
	}
}
class BinarySearchTree{
	Node root;

	BinarySearchTree(){
		root = null;
	}

	void insert(int key){
		root = insertKey(root, key);
	}

	Node insertKey(Node root, int key){
		if (root == null){
			root = new Node(key);
			return root;
		}

		if (key < root.key){
			root.left = insertKey(root.left, key);
		}
		else if (key > root.key){
			root.right = insertKey(root.right, key);
		}
		return root;
	}

	// Inorder Traversal
	void inorder(){
		inorderTraversal(root);
	}

	void inorderTraversal(Node root){
		if (root != null){
			inorderTraversal(root.left);
			System.out.print(root.key + " ");
			inorderTraversal(root.right);
		}
	}

	public Node search(Node root, int key){
		if (root == null || root.key == key){
			return root;
		}
		if (key < root.key){
			return search(root.left, key);
		}

		return search(root.right, key);
	}
}

class BST_Search_Insert{
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		tree.inorder();

		System.out.println(tree.search(tree.root, 70));
	}
}