package algostudy.junga;

public class BubbleSort {
	//배열받음
	private static void bubbleSort(int[] arr) {
		//재귀함수 호출, 처음에는 모든 배열이 정렬이 안된상태니까 배열의 마지막인덱스로 주면됨.
		bubbleSort(arr, arr.length -1);
		
	}
	// 2. 재귀함수가 그것을 인자로 받아서 마지막 인덱스가 0보다 클때까지 재귀호출을 실행한다.
	private static void bubbleSort(int[] arr,int last) {
		if(last > 0) {
			// 3. 1번 인덱스부터 정렬해야되는 마지막 인덱스까지 돌린다. 그리고 돌 때마다 비교 
			for(int i=0; i<= last; i++) {
				if( arr[i - 1] > arr[i]) {
					swap(arr, i - 1, i);
				}
			}
			bubbleSort(arr, last - 1);
		}
	}
	private static void swap(int[] arr, int source, int target) {
		int tmp = arr[source];
		arr[source] = arr[target];
		arr[target] = tmp;
	}
	
	private static void printArray(int[] arr) {
		for(int data : arr) {
			System.out.println(data + ",");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] arr= {3,5,4,2,1};
		printArray(arr);
		bubbleSort(arr);
		printArray(arr);
	}

}
