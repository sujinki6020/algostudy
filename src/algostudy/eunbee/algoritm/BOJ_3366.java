package algostudy.eunbee.algoritm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

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
		
		for(int i = 1; i < seqList.size(); i++) {
			//최소값의 위치 확인
			int index =  seqList.indexOf(sortList.get(i));

			int mid = seqList.get(index);
			int left = seqList.get(index -1);
			int right = seqList.get(index +1);
			
			int caseNum = 0;
			//제일 끝쪽의 숫자
			if(index == 0 || index == sortList.size()-1) {
				if(index == 0 && mid > right) {
					caseNum++;
				}else if(index == seqList.size()-1 && mid > left){
					caseNum++;
				}
			}else {
				if(mid > left) caseNum++;
				if(mid > right) caseNum++;
			}
			
			//합계 구하고 수열 재생성 후 i값도 초기화
			switch(caseNum) {
			//인덱스 양옆의 수가 더 크다
			case 0:
				break;
			//인덱스 양옆의 수 둘 중 하나보다 크다
			case 1:
				int in = seqList.indexOf(left < right? left:right);
				//수열 재생성
				seqList = remakeList(in, seqList);
				i = 0;
				break;
			//인덱스가 양옆의 수 보다 다 크다.
			case 2:
				break;
			}
			
			
		}
	}
	public static class Ascending implements Comparator<Integer>{
		@Override
		public int compare(Integer o1, Integer o2) {
			return o1.compareTo(o2);
		}
		
	}
	public static List<Integer> remakeList(int index, List<Integer> seqList){
		
		return null;
	}
	
}
