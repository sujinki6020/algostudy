package algostudy.sujin.datastructure;

public class CircularQueue {
	// rear&front 0에서 시작
	int front = 0;
	int rear = 0;
	int maxSize = 0;
	int[] circularQueue;
	
	public CircularQueue(int maxSize) {
		this.maxSize = maxSize;
		circularQueue = new int[this.maxSize];
	}
	
	// 배열이 비어 있는지 확인
	public boolean isEmpty() {
		if(rear==front) {
			return true;
		}
		return false;
	}
	
	// 배열이 포화 상태인지 확인
	public boolean isFull() {
		if((rear+1)%maxSize==front) {
			return true;
		}
		return false;
	}
	
	public void enqueue(int num) {
		if(isFull()) {
			System.out.println("Queue is Full");
		} else {
			rear = (rear+1)%maxSize;
			circularQueue[rear] = num;
		}
	}
	
	public int dequeue() {
		if(isEmpty()) {
			return -1;
		} else {
			front = (front+1)%maxSize;
			return circularQueue[front];
		}
	}
}
