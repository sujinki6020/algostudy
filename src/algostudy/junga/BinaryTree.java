/*
 *     1
 *   2   3
 * 4  5  
 * 
 - Inorder  (Left,Root,Right) - 왼쪽이 먼저 4 2 5 1 3 
 - Preorder (Root,Left,Right) 자기 자신부터 출력 1 2 4 5 3
 - Poster (Left,Right,Root) 자기 자신을 마지막에 출력 4 5 2 3 1 
 * 
 * */

package algostudy.junga;

// 노드 생성
class Node{
	int data;
	Node left;
	Node right;
}

// 
class Tree{
	// tree 시작점 
	public Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	// 노드를 만드는 함수 
	public Node makeNode(Node left, int data, Node right) {
		Node node = new Node();
		node.data = data;
		node.left = left;
		node.right = right;
		return node;
	}
	public void inorder(Node node) {
		// 노드가 null이 아닐때까지 재귀호출을 반복한다.
		if(node != null) {
			inorder(node.left);
			System.out.println(node.data);//나 자신을 호출하고
			inorder(node.right);
		}
	}
	
	public void preorder(Node node) {
		if(node != null) {
			System.out.println(node.data);
			preorder(node.left);
			preorder(node.right);
		}
	}
	
	public void postorder(Node node) {
		if(node != null) {
			postorder(node.left);
			postorder(node.right);
			System.out.println(node.data);
		}
	}
}

// Binary테스트 실행
public class BinaryTree {
  public static void mani(String[] args) {
	  Tree t = new Tree();
	  Node n4 = t.makeNode(null,4,null);
	  Node n5 = t.makeNode(null, 5, null);
	  Node n2 = t.makeNode(n4, 2, n5);
	  Node n3 = t.makeNode(null, 3, null);
	  Node n1 = t.makeNode(n2, 1, n3);
	  t.setRoot(n1);
	  t.inorder(t.getRoot());
  }
}
