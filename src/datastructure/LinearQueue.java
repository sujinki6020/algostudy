package datastructure;

public class LinearQueue {
	int rear = -1;
	int front = 0;
	int maxSize = 0;
	int[] linearQueue;
	
	public LinearQueue(int maxSize) {
		this.maxSize = maxSize;
		linearQueue = new int[maxSize];
	}
	
	public void enqueue (int num) {
		if(rear != maxSize-1) {
			linearQueue[++rear] = num;
		} else {
			System.out.println("Data Full");
		}
	}
	
	public int dequeue() {
		if(rear!=front || (rear==0&&front==0)) {
			int temp = linearQueue[front];
			for(int i=1; i<rear; i++) {
				linearQueue[i-1] = linearQueue[i];
			}
			rear--;
			return temp;
		} else {
			return -1;
		}
	}
}
