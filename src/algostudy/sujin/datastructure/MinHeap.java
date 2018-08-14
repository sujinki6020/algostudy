package algostudy.sujin.datastructure;

/*
 * Heap : 삽입, 삭제 연산이 일반 트리구조의 그것과는 다소 다름
 *        삽입 - 아래에서 위로 비교
 *        삭제 - rootNode를 삭제 -> 마지막 node를 root로 올림 -> dnldptj dkfofh qlry 
 *        **Key값의 index를 알고 있는 것이 중요 = 순차 자료 구조 ==> 배열을 이용하여 구현하는 것이 좋음
 *        
 *        https://www.youtube.com/watch?v=yN8yHDV1FWk 참고
 */

public class MinHeap {
	private int[] heap;
	private int capacity;
	private int pos;
	
	public MinHeap() {
		pos = 1;
		capacity = 10;
		heap = new int[capacity];
	}
	
	public void insert(int value) {
		if(pos==capacity) {
			// increase the capacity
		} else {
			heap[pos++] = value;
			
			int child = pos - 1;
			int parent = child/2;
			
			while(heap[parent] > heap[child] && parent > 0) {
				int temp = heap[parent];
				heap[parent] = heap[child];
				heap[child] = temp;
				
				child = parent;
				parent = child/2;
			}
		}
	}
	
	public void printHeap() {
		for(int i=1; i<pos; i++) {
			System.out.print(heap[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		MinHeap minHeap = new MinHeap();
		minHeap.insert(12);
		minHeap.insert(7);
		minHeap.insert(6);
		minHeap.insert(10);
		minHeap.insert(8);
		minHeap.insert(20);
		
		minHeap.printHeap();
	}
}
