package greatLearning;
//no child(leaf node) 
public class DeletionofNode {
	static class Node{
		Node left,right;
		int data;
		Node(int data){
			this.data = data;
		}
	}
	public static Node insert(Node root, int key) {
		if(root == null) {
			root = new Node(key);
			return root;
		}
		if(root.data>key) {
			root.left = insert(root.left, key);
		}
		else {
			root.right = insert(root.right, key);
		}
		return root;
	}
	public static void inOrder(Node root) {
		if(root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data);
		inOrder(root.right);
	}
		
	

}
