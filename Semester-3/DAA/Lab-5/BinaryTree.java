import java.util.Stack;

// Class containing left and right child of
// current node and key value
class Node {
	int data;
	Node left, right;

	public Node(int item)
	{
		data = item;
		left = right = null;
	}
}

// Class to print the inorder traversal
class BinaryTree {
	Node root;
	void inorder()
	{
		if (root == null)
			return;

		Stack<Node> stack = new Stack<Node>();
		Node curr = root;

		// traverse the tree
		while (curr != null || stack.size() > 0) {

			// Reach the left most
			// Node of the current Node
			while (curr != null) {
				// place pointer to a tree node on
				// the stack before traversing
				// the node's left subtree
				stack.push(curr);
				curr = curr.left;
			}

			// Current must be NULL at this point
			curr = stack.pop();

			System.out.print(curr.data + " ");

			// we have visited the node and its
			// left subtree. Now, it's right
			// subtree's turn
			curr = curr.right;
		}
	}

	public static void main(String args[])
	{

		// Creating a binary tree and
		// entering the nodes
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.inorder();
	}
}
