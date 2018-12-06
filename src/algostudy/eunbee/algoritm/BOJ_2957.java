package algostudy.eunbee.algoritm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_2957 {
	public static void main(String[] args) {
		List<Integer> list = setInput();
		getDepth(list);
	}
	
	public static List<Integer> setInput() {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i< count; i++) {
			list.add(sc.nextInt());
		}
		return list;
	}
	
	public static void getDepth(List<Integer> list) {
		
		//최대, 최소값 저장할 곳
		List<Integer> maxList = new ArrayList<>();
		List<Integer> minList = new ArrayList<>();
		//노드들이 차고있는 현황 배열
		List<Integer> fullArr = new ArrayList<>(list.size());
		//0으로 초기화
		for(int i :fullArr) {
			fullArr.set(i, 0);
		}
		int min = 0;
		int max = 0; 
		
		for(int i = 0; i < list.size(); i++) {
			int num = list.get(i);
			//0일때
			if(max == 0 || min == 0 ) {
				max = num; min = num;
				
				maxList.add(max);
				minList.add(min); 
				fullArr.set(i, fullArr.get(i)+1); 
			}
			
			if(num > min && num < max) {
				//꽉찬 노드 제외하고 맥스 아래부터 탐색
				int maxSize = maxList.size();
				int minSize = minList.size();
				int size = maxSize>minSize? maxSize: minSize; 
				int getMax = maxList.get(maxSize-1);
				int getMin = minList.get(minSize-1);
				
				for(int j =0; j < size; j++) {
					if(maxSize > j+1) {
						getMax = maxList.get(j);
					}
					if(minSize > j+1) {
						getMin = minList.get(j);
					}
					
					//범위안에 들어있으면 해당 깊이가 꽉차있는지 확인한다
					if(num <getMax && num<getMin) {
						//빈공간 확인
						if(fullArr.get(maxList.indexOf(getMax)) != fullArr.indexOf(maxList.indexOf(getMax))) {
							System.out.println(maxList.indexOf(getMax));
							fullArr.set(maxList.indexOf(getMax), maxList.indexOf(getMax)+1);
						}
					}
				}
				
				
			}else {
				if(num > max) {
					max = num;
					maxList.add(max);
					
					int ioMax = maxList.indexOf(max);
					System.out.println(ioMax);
					
					//fullArr채우기
					fullArr.set(ioMax-1, fullArr.get(ioMax-1)+1);
				}
				if(num < min) {
					min = num;
					minList.add(min);
					int ioMin = minList.indexOf(min);
					System.out.println(ioMin);
					
					//fullArr채우기
					fullArr.set(ioMin-1, fullArr.get(ioMin-1)+1);
					
				}
			}
			
		}
		
	}
}
 