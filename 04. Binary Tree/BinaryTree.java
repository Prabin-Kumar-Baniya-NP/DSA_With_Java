class Node{
	int key;
	Node left, right;

	public Node(int element){
		key = element;
		left = right = null;
	}
}
class BinaryTree{
	Node root;

	BinaryTree(){
		root = null;
	}
	BinaryTree(int key){
		root = new Node(key);
	}
	public static void main(String[] args){
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
	}
}