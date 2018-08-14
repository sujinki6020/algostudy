package algostudy.sujin.datastructure;

public class QuickSort {
	private static void quickSort(int[] arr) {
		// 정렬할 배열을 받아서 시작/끝 지점 정한 후 재귀 함수 호출
		quickSort(arr, 0, arr.length-1);
	}
	
	// 재귀함수 호출 시 partition을 나눌 range, start&end pointer를 parameter로 받음
	private static void quickSort(int[] arr, int start, int end) {
		// 나눈 partition 오른쪽의 첫 번째 값
		int part2 = partition(arr, start, end);
		// 오른쪽 partition이 시작점 바로 다음에서 시작한다면 
		// 왼쪽 partition값이 하나 뿐이므로 정렬할 필요가 없음
		
		// 오른쪽이 시작점에서 한 칸 이상 떨어졌을 경우에만 quickSort 재귀함수 호출 -> 다시 정렬 
		if(start < part2 - 1) {
			quickSort(arr, start, part2-1); // 왼쪽 partition
		}
		// 오른쪽 partition의 배열 방 개수가 하나 이상일 때만 호출
		if(part2 < end) {
			quickSort(arr, part2, end);
		}
	}
	
	// partition 나누는 함수 : parameter = arr주소, partition을 나눌 시작과 끝의 index
	private static int partition(int[] arr, int start, int end) {
		// pivot : 배열에서 물리적으로 중간에 있는 값
		int pivot = arr[(start+end)/2];
		// 시작점이 끝 지점보다 작거나 같은 동안에만 양쪽 끝의 pointer 이동
		while(start <= end) {
			// start pointer 이동
			while(arr[start] < pivot) start++;
			// end pointer 이동
			while(arr[end] > pivot) end--;
			if(start <= end) {
				swap(arr, start, end);
				start++;
				end--;
			}
		}
		// start pointer = 새로 나눌 오른쪽 partition의 첫 번째 배열 index가 들어감
		return start;
	}
	
	// swap 함수
	private static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
	
	// 배열 출력 함수
	private static void printArray(int[] arr) {
		for(int data:arr) {
			System.out.print(data + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[] = {3,9,4,7,5,0,1,6,8,2};
		printArray(arr); // 정렬되기 전 배열 출력
		quickSort(arr);
		printArray(arr); // 정렬된 후 배열 출력
	}
}
