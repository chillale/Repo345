package greatLearning;


public class BinarySearchTree {
	static class Node{
		int data;
		Node left,rigt;
		Node(int data){
			this.data = data;
		}
	}
	public static Node insert(Node root, int value) {
		if(root ==  null) {
			root = new Node(value);
			return root;
		}
		if(root.data>value) {
			//left subtree
			root.left=insert(root.left,value);
		}
		else {
			//right subtree
			root.rigt = insert(root.rigt,value);
		}
		return root;
	}
	public static void inOrder(Node root) {
		if(root==null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data+ " ");
		inOrder(root.rigt);
	}
	public static boolean search(Node root, int key) {
		if(root==null)
			return false;
		if(root.data>key) {
			return search(root.left, key);
			
		}
		else if(root.data==key) {
			return true;
		}
		else  {
			return search(root.rigt, key);
		}
	}
       public static void main(String[] args) {
		int values[]= {5,1,2,3,4,7};
		Node root = null;
		for(int i=0;i<values.length;i++) {
			root = insert(root,values[i]);
		}
		inOrder(root);
		System.out.println();
		if(search(root, 4)) {
			System.out.println("found");
		}
		else {
			System.out.println("not found");
		}
	}
}
