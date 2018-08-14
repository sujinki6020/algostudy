package algostudy.sujin.datastructure;

public class BubbleSort {
	private static void bubbleSort(int[] arr) {
		bubbleSort(arr, arr.length-1);
	}
	
	private static void bubbleSort(int[] arr, int last) {
		if(last>0) {
			for(int i=1; i<=last; i++) {
				// 자기 자신의 앞이 자신보다 클 때 => swap
				if(arr[i-1] > arr[i]) {
					swap(arr, i-1, i);
				}
			}
			// 배열의 맨 마지막은 정렬이 된 상태이므로 마지막 index는 빼고 재귀호출
			bubbleSort(arr, last-1);
		}
	}
	
	private static void swap(int[] arr, int source, int target) {
		int temp = arr[source];
		arr[source] = arr[target];
		arr[target] = temp;
	}
	
	private static void printArray(int[] arr) {
		for(int data : arr) {
			System.out.print(data + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = {3,5,4,2,1};
		printArray(arr);
		bubbleSort(arr);
		printArray(arr);
	}
}
