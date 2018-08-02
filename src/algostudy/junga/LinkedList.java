/*
 * 하나의 엘리먼트(노드)가 하나의 객체 
 * 가장 중요한 것 : 노드의 구현
 * 
 * */

package algostudy.junga;

public class LinkedList {
	
	// 누가 첫번째인지 정보를 담는 head라는 변수를 담는다.
	private Node head;
	// 누가 가장 끝에 있는 정보를 담는지 
	private Node tail;
	// 사이즈 
	private int size = 0;
	
	// node라는 클래스를 정의 
	//하나의 node는 데이터를 저장하고, 다음 node가 누구인지를 저장
	private class Node{
		private Object data;
		private Node next; 
		// 생성자를 이용해서 노드라는 객체가생성될때 생성자 초기화
		public Node(Object input) {
			this.data = input;
			this.next = null; 
		}
		 // 노드의 내용을 쉽게 출력해서 확인해볼 수 있는 기능
		public String toString() {
			return String.valueOf(this.data);
		}
	}
	public void addFirst(Object input) {
		//제일 먼저 addFirst로 들어온 input값을 통해 객체를 만드는게 중요
		Node newNode = new Node(input); 
		newNode.next = head; 
		head = newNode;
		size++; // addFirst를 통해 새로운 노드를 추가했으니 사이즈가증가
		if(head.next == null) {
			tail = head;
		}
	}
	

}
