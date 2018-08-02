package algostudy.junga;

import java.util.EmptyStackException;
import java.util.Stack;

/*
 * 1. 스택 클래스를 만든다.
 * 2. 객체를 만들때 데이터 타입 명시하고 같은 타입을 받는 노드를 선언한다.
 * 3. 생성자에서 데이터를 받아서 내부 변수에 저장한다.
 * 4. 스택은 맨위 주소만 알고 있어도 된다.
 * 
 * */
class Stact<T>{
	class Node<T>{
		private T data;
		private Node<T> next;
		public Node(T data) {
			this.data = data;
		}
	}
	
	private Node<T> top;
	
	public T pop() {
		if(top == null) {
			throw new EmptyStackException();
		}
		// 데이터 백업하고 다음애를 top으로 만들어줌.
		T item = top.data;
		top = top.next;
		return item;
		
	}
	public void push(T item) {
		Node<T> t = new Node<T>(item);
		t.next = top;
		top = t;
	}
	
	// T타입에 데이터를 반환
	public T peek() {
		if(top == null) {
		throw new EmptyStackException();
		}
		return top.data;
	}
	
	// top이 null인지 확인 
	public boolean isEmpty() {
		return top == null;
	}
}

public class StackTest {
   public static void main(String[] args) {
	Stack<Integer> s = new Stack<Integer>();
	s.push(1);
	s.push(2);
	s.push(3);
	s.push(4);
	System.out.println(s.pop());
	System.out.println(s.pop());
	System.out.println(s.peek());
	System.out.println(s.pop());
	System.out.println(s.isEmpty());
	System.out.println(s.pop());
	System.out.println(s.isEmpty());
	
   }
}
