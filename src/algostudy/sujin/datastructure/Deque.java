package algostudy.sujin.datastructure;
/*
 * Deque : Queue의 양쪽 끝에서 삽입/삭제가 모두 발생; Queue와 Stack의 성질을 모두 가지고 있는 자료구조
 * 코드 참고 : http://songeunjung92.tistory.com/25?category=155475
 * 
 */
class DequeNode {
	char data;
	DequeNode leftLink;
	DequeNode rightLink;
	
	public DequeNode() {
		this.leftLink = null;
		this.rightLink = null;
	}
	
	public DequeNode(char data) {
		this.data = data;
		this.leftLink = null;
		this.rightLink = null;
	}
}

public class Deque {
	DequeNode front;
	DequeNode rear;

	public Deque() {
		front = null;
		rear = null;
	}
	
	public boolean isEmpty() {
		return (front == null);
	}
	
	public void insertFront(char item) {
		DequeNode node = new DequeNode(item);
		if(isEmpty()) {
			front = node;
			rear = node;
			node.rightLink = null;
			node.leftLink = null;
		} else {
			node.rightLink = front;
			node.leftLink = null;
			front.leftLink = node;
			front = node;
		}
	}
	
	public char deleteFront() {
		if(isEmpty()) {
			System.out.println("Deque is empty.");
			return 0;
		} else {
			char data = front.data;
			if(front.rightLink==null) {
				front = null;
				rear = null;
			} else {
				front = front.rightLink;
				front.leftLink = null;
			}
			return data;
		}
	}
	
	public void insertRear(char item) {
		DequeNode node = new DequeNode(item);
		if(isEmpty()) {
			front = node;
			rear = node;
			node.rightLink = null;
			node.leftLink = null;
		} else {
			node.leftLink = rear;
			node.rightLink = null;
			rear.rightLink = node;
			rear = node;
		}
	}
	
	public char deleteRear() {
		if(isEmpty()) {
			System.out.println("Deque is empty.");
			return 0;
		} else {
			char data = rear.data;
			if(rear.leftLink==null) {
				front = null;
				rear = null;
			} else {
				rear = rear.leftLink;
				rear.rightLink = null;
			}
			return data;
		}
	}
	
	public void removeFront() {
		if(isEmpty()) {
			System.out.println("Deque is empty.");
		} else {
			if(front.rightLink==null) {
				front = null;
				rear = null;
			} else {
				front = front.rightLink;
				front.leftLink = null;
			}
		}
	}
	
	public void removeRear() {
		if(isEmpty()) {
			System.out.println("Deque is empty.");
		} else {
			if(rear.leftLink==null) {
				front = null;
				rear = null;
			} else {
				rear = rear.leftLink;
				rear.rightLink = null;
			}
		}
	}
	
	public char peekFront() {
		if(isEmpty()) {
			System.out.println("Deque is empty.");
			return 0;
		} else {
			return front.data;
		}
	}
	
	public void print() {
		if(isEmpty()) {
			System.out.println("Deque is empty.");
		} else {
			DequeNode node = front;
			while(node != null) {
				System.out.println(node.data + " ");
				node = node.rightLink;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		char deletedItem;
		Deque dq = new Deque();
		dq.insertFront('A');
		dq.print();
		dq.insertFront('B');
		dq.print();
		dq.insertFront('C');
		dq.print();
		
		deletedItem = dq.deleteFront();
		if(deletedItem != 0) {
			System.out.println("Front Deleted Item : "+ deletedItem);
		}
		dq.print();
		
		deletedItem = dq.deleteRear();
		if(deletedItem != 0) {
			System.out.println("Front Deleted Item : "+ deletedItem);
		}
		dq.print();
		
		dq.insertRear('D');
		dq.print();
		dq.insertFront('E');
		dq.print();
		dq.insertFront('E');
		dq.print();
	}
}
