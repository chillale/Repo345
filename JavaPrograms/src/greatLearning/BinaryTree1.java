package greatLearning;


class Node{
	char key;
	Node left,right;
	Node(char key){
	this.key=key;
	}
}
class TreeTraversal{
	Node root;
	void preOrderTraversal(Node n) {
		if(n!=null) {
			System.out.print(n.key+ " ");
			preOrderTraversal(n.left);
			preOrderTraversal(n.right);
		}
	}
	void postOrderTraversal(Node n) {
		if(n!=null) {
			
			preOrderTraversal(n.left);
			preOrderTraversal(n.right);
			System.out.print(n.key+ " ");
		}
	}
	void inOrderTraversal(Node n) {
		if(n!=null) {
			
			preOrderTraversal(n.left);
			System.out.print(n.key+ " ");
			preOrderTraversal(n.right);
		}
	}
}
public class BinaryTree1 {
	public static void main(String[] args) {
		TreeTraversal treeTraversal = new TreeTraversal();
		treeTraversal.root = new Node('a');
		treeTraversal.root.left = new Node('b');
		treeTraversal.root.right = new Node('c');
		treeTraversal.root.left.right = new Node('d');
		treeTraversal.root.left.left = new Node('e');
		treeTraversal.preOrderTraversal(treeTraversal.root);
		System.out.println();
		treeTraversal.postOrderTraversal(treeTraversal.root);
		System.out.println();
		treeTraversal.inOrderTraversal(treeTraversal.root);
	}

}
