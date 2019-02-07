package algostudy.eunbee.algoritm.BOJ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class BOJ_3366 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		List<Integer> seqList = new ArrayList<>();
		List<Integer> sortList = new ArrayList<>();
		//리스트에 수열 담기
		for(int i=0 ; i<count; i++) {
			int num = sc.nextInt();
			seqList.add(num);
			sortList.add(num);
		}
		
		
		Ascending asce = new Ascending();
		Collections.sort(sortList, asce);
		
		int sum = 0;
		int max = 0;
		remakeList(seqList, sortList, sum, max, count);
		System.out.println(sum);
		
	}
	public static class Ascending implements Comparator<Integer>{
		@Override
		public int compare(Integer o1, Integer o2) {
			return o1.compareTo(o2);
		}
		
	}
	public static void remakeList(List<Integer> seqList, List<Integer> sortList, int sum, int max, int count){
		while(seqList.size() == 1) {
			if(sortList.size() == count) {
				max = sortList.get(0);
			}
			//최소값부터 위치 확인
			int index = seqList.indexOf(max);
			int left =0;
			int right =0;
			
			int mid = seqList.get(index);
			if(index == 0) {
				right = seqList.get(index+1);
				
			}else if(index == seqList.size()-1) {
				left = seqList.get(index-1);
				
			}else {
				right = seqList.get(index+1);
				left = seqList.get(index-1);
			}
			
			int caseNum = 0;
			//mid숫자가 수열의 바깥쪽에 위치해있을 경우
			if(index == 0 || index == sortList.size()-1) {
				if(index == 0 && mid > right) {
					caseNum++;
				}else if(index == seqList.size()-1 && mid > left){
					caseNum++;
				}else {
					max = updateMax(sortList, max);
				}
			//mid숫자가 수열의 바깥쪽이 아닌 중간에 위치해있을때
			}else {
				//중간 값이 젤 클때
				if(mid >= left) caseNum++;
				if(mid >= right) caseNum++;
			}
			
			//합계 구하고 수열 재생성 후 i값도 초기화
				switch(caseNum) {
				//인덱스 양옆의 수가 더 크다
				case 0:
					max = updateMax(sortList, max);
					break;
				//인덱스 양옆의 수 둘 중 하나보다 크다
				case 1:
					int min = seqList.indexOf(left < right? left:right);
					//수열 재생성 & 재귀
					sum += mid;
					seqList.remove(min);
					sortList.remove(min);
					remakeList(seqList, sortList, sum, max, count);
					break;
				//인덱스가 양옆의 수 보다 다 크다.
				case 2:
					sum+=(mid*2);
					seqList.remove(left);
					seqList.remove(right);
					sortList.remove(left);
					sortList.remove(right);
					break;
				}
		}
	}
	public static int updateMax(List<Integer>sortList, int max) {
		int index = sortList.get(max);
		if(index != sortList.size()-1) {
			max = sortList.get(index+1);
		}
		return max;
	}
	
}
