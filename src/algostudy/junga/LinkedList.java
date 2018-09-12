/*
 * 하나의 엘리먼트(노드)가 하나의 객체 
 * 가장 중요한 것 : 노드의 구현
 * 
 * */

package algostudy.junga;

import java.util.List;

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
	public void addLast(Object input) {
		Node newNode = new Node(input);
		if(size == 0) // 데이터가 없는상태라면 앞뒤 어디에나 데이터를 넣어도 상관없다.
		{ addFirst(input);}
		else {
			tail.next = newNode;// 새로운 노드로 지정
			tail = newNode;
			size++;
		}
	}
	
	// 내부적으로 사용하는 api구현
	// 내부라 public이 아니지만 테스트를 위해서 지정
	// 그림 참고
	public Node node(int index) {
		Node x = head; 
		for(int i=0; i < index; i++) {
			x = x.next;			
		}
		return x;
		
	}
	// 사이에 넣기 k는 인덱스 
	public void add(int k,Object input) {
		if(k==0) {
			addFirst(input);
		}else {
			// 인덱스가 먼지 알아내는 메서드
			Node temp = node(k-1); // x는 헤드
			Node temp2 = temp.next;
			Node newNode = new Node(input);
			temp.next = newNode;
			newNode.next = temp2;
			size++;
			if(newNode.next == null) {
				tail = newNode;
			}
			// 이해가 안갈경우 그림 참고 
		}
	}
	public String toString() {
		if(head == null) {
			return "[]";
		}else {
			Node temp = head;
			String str = "[";
			while(temp.next != null) {
				str += temp.data + ","; 
				temp = temp.next;
				
			}
			str += temp.data;
			return str + "]";
		}
	}
	public Object removeFirst() {
		Node temp = head;
		head = temp.next;
		Object returnData = temp.data; // 임시변수 삭제전
		temp = null;
		return returnData;
	}
	// 특정한 위치에 엘리먼트를 삭제하는 방법 
	public Object remove(int k) {
		if(k == 0) {
			return removeFirst();
		}else {
			 Node temp = node(k-1); // 이전 인덱스값 
			 Node todoDelete = temp.next; // 삭제하려는 노드
			 temp.next = temp.next.next;
			 Object returnData = todoDelete.data;
			 if(todoDelete == tail) {
				 tail = temp; // 삭제하려는 노드 이전이다.
			 }
			 todoDelete = null;
			 size--;
			 return returnData;
		}
	}
	public Object removeLast() {
		return remove(size-1);
	}
}
