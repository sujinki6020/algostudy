/*
 * Binary Tree Traversal : 재귀적으로 구현 -> 트리의 높이가 높을 수록 깊이 탐색해야 하므로 Stack overflow 가능성이 있음
 * 
 */

package algostudy.sujin.datastructure;

class Node {
	int data;
	Node left; // BT : DATA와 두 개의 child node를 가짐
	Node right;
}

class Tree {
	public Node root; // tree 시작점 root 선언
	
	public void setRoot(Node node) {
		this.root = node;
	}
	
	public Node getRoot() {
		return root;
	}
	
	// Node 만드는 함수(data, left, right를 받아서 할당)
	public Node makeNode(Node left, int data, Node right) {
		Node node = new Node();
		node.data = data;
		node.left = left;
		node.right = right;
		return node;
	}
	
	// left -> root -> right
	public void inorder(Node node) { 
		// node가 null이 아닐 때까지 재귀호출 반복
		if(node != null) {
			inorder(node.left); // 왼쪽 재귀 호출을 다 돌고 오면,
			System.out.println(node.data); // root(자기 자신)을 출력
			inorder(node.right); // 오른쪽 재귀 호출
		}
	}
	
	// root -> left -> right
	public void preorder(Node node) {
		if(node != null) {
			System.out.println(node.data); // 자기자신 먼저 출력(root)
			preorder(node.left); // 왼쪽 재귀 호출
			preorder(node.right); // 오른쪽 재귀 호출
		}
	}
	
	// left -> right -> root
	public void postorder(Node node) {
		if(node != null) {
			postorder(node.left);
			postorder(node.right);
			System.out.println(node.data);
		}
	}
}

public class BTTraversal {
	
	public static void main(String[] args) {
		// Tree 생성
		//    (1)
		//   /   \
		//  (2)  (3)
		//  / \
		// (4) (5)
	
		// inorder(Left->Root->Right) : 4 2 5 1 3
		// preorder(Root->Left->Right) : 1 2 4 5 3
		// postorder(Left->Right->Root) : 4 5 2 3 1
		Tree t = new Tree();
		Node n4 = t.makeNode(null, 4, null);
		Node n5 = t.makeNode(null, 5, null);
		Node n2 = t.makeNode(n4, 2, n5);
		Node n3 = t.makeNode(null, 3, null);
		Node n1 = t.makeNode(n2, 1, n3);
		
		t.setRoot(n1); // 1번 node를 root로 지정
//		t.inorder(t.getRoot());
//		t.preorder(t.getRoot());
		t.postorder(t.getRoot());
	}

}
