package algostudy.eunbee;
/**
 * 이진트리의 종류
 * 		 (1)
 * 	  (2)   (3)
 *  (4) (5)
 *  Inorder (Left, Root, Right) : 4,2,5,1,3
 *  Preorder (Root, Left, Right) : 1,2,4,5,3
 *  PostOrfer (Left, Right,Root) : 
 */
//2진트리 - 데이터와 2개의 childNode
class Node{
	int data;
	Node left;
	Node right;
}
class Tree{
	public Node root;
	
	public void setRoot(Node node) {
		this.root = node;
	}
	public Node getRoot() {
		return root;
	}
	public Node makeNode(Node left, int data, Node right) {
		Node node = new Node();
		node.data = data;
		node.left = left;
		node.right = right;
		return node;
	}
	//왼쪽, 자신, 오른쪽
	public void inorder(Node node) {
		if(node !=null) {
			inorder(node.left);
			System.out.println(node.data);
			inorder(node.right);
		}
	}
	//나자신을 먼저 출력, 
	public void preorder(Node node) {
		if(node !=null) {
			System.out.println(node.data);
			preorder(node.left);
			preorder(node.right);
		}
	}
	//나 자신을 나중에 출력
	public void postorder(Node node) {
		if(node != null) {
			postorder(node.left);
			postorder(node.right);
			System.out.println(node.data);
		}
	}
}

public class TreeTest {
	public static void main(String[] args) {
		Tree t= new Tree();
		Node n4 = t.makeNode(null, 4, null);
		Node n5 = t.makeNode(null, 5, null);
		Node n2 = t.makeNode(n4, 2, n5);
		Node n3 = t.makeNode(null, 3, null);
		Node n1 = t.makeNode(n2, 1, n3);
		
		t.setRoot(n1);
		t.inorder(t.getRoot());
	}
}
