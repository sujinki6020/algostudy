package algostudy.sujin.datastructure;

public class MergeSort {
	// mergeSort 함수 : parameter = 정렬할 배역
	private static void mergeSort(int[] arr) {
		// 배열의 크기만큼 임시 저장 공간
		int[] temp = new int[arr.length];
		// 정렬할 배열, 임시 저장 공간, 시작 index, 끝 index을 parameter로 넘겨줘서 재귀 호출
		mergeSort(arr, temp, 0, arr.length - 1);
	}
	
	private static void mergeSort(int[] arr, int[] temp, int start, int end) {
		// 시작 index가 끝 index보다 작을 동안만 재귀호출
		if(start < end) {
			// 함수 호출 시 배열 반으로 나누기
			int mid = (start+end)/2;
			// 배열의 앞 부분
			mergeSort(arr, temp, start, mid);
			// 배열의 뒷 부분
			mergeSort(arr, temp, mid+1, end);
			// 재귀 함수가 돌아왔을 때는 mid를 기준으로 왼쪽/오른쪽이 정렬된 상태 => 병합
			merge(arr, temp, start, mid, end);
		}
	}
	
	// 병합 함수
	private static void merge(int[] arr, int[] temp, int start, int mid, int end) {
		// 임시 저장 공간에 정렬이 된 배열을 필요한 만큼 복사
		for(int i = start; i<= end; i++) {
			temp[i] = arr[i];
		}
		int part1 = start; // 첫 번째 배열의 첫 번째 인덱스
		int part2 = mid + 1; // 두 번째 배열의 첫 번째 인덱스
		int index = start; // 양쪽 배열에서 작은 값을 하나씩 복사할 때마다 결과 배열 어디에 저장할 지 알아야 함
		                   // 복사할 때마다 +1 -> 다음에 저장할 곳을 기억
		
		// 첫 번째 배열의 끝까지 갈 때까지 && 두 번째 배열의 끝까지 갈 때까지 반복
		while(part1 <= mid && part2 <= end) {
			// 두 개의 배열 비교
			if(temp[part1] <= temp[part2]) {
				arr[index] = temp[part1];
				part1++;
			} else {
				arr[index] = temp[part2];
				part2++;
			}
			index++;
		}
		// 앞쪽 데이터가 남았을 때
		for(int i=0; i <= mid - part1; i++) {
			arr[index+i] = temp[part1+i];
		}
	}
	
	private static void printArray(int[] arr) {
		for(int data: arr) {
			System.out.print(data + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = {3,9,4,7,5,0,1,6,8,2};
		printArray(arr);
		mergeSort(arr);
		printArray(arr);
	}
}
