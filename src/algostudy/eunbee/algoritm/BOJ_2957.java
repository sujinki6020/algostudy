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
		
		List<Integer> maxList = new ArrayList<>();
		List<Integer> nodeList = new ArrayList<>();
		
		int fullIndex = 1;
		int min = 0;
		int max = 0; 
		
		for(int i = 0; i < list.size(); i++) {
			int num = list.get(i);
			if(max == 0 || min == 0 ) {
				max = num; 
				min = num;
				nodeList.add(num);
			}
//			if()
//			if(max < num) {
//				max = num;
//				maxList.add(max);
//			}
//			
//			
//			if(num < max && num < min) {
//				count++;
//			}
//			
//			
//			if(fullIndex == count) {
//				fullIndex++;
//				count = 0;
//			}
				
		}
		
	}
}
 