package algostudy.sujin.datastructure;

public class SelectionSort {
	private static void selectionSort(int[] arr) {
		selectionSort(arr, 0); // parameter = 배열, 정렬이 되지 않은 부분의 시작 위치 (처음에는 아무것도 정렬이 되지 않은 상태이므로 제일 첫 번째 시작 위치를 parameter로 넘김)
	}
	
	private static void selectionSort(int[] arr, int start) {
		// 시작점이 배열의 마지막보다  작은 동안 재귀호출
		if(start < arr.length-1) {
			// 가장 작은 값을 저장할 변수
			int min_index = start;
			for(int i=start; i<arr.length; i++) {
				if(arr[i] < arr[min_index]) min_index = i; // 값 비교 후 index update
			}
			swap(arr, start, min_index);
			selectionSort(arr, start+1); // 제일 앞은 정렬이 된 상태이므로 그 다음부터 재귀호출
		}
	}
	
	private static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	private static void printArray(int[] arr) {
		for(int data : arr) {
			System.out.print(data + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = {3,6,1,8,2,4};
		printArray(arr);
		selectionSort(arr);
		printArray(arr);
	}
}
