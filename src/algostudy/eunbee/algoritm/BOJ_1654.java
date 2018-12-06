package algostudy.eunbee.algoritm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_1654 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//기존 갯수
		int defRan = sc.nextInt();
		//최종 갯수
		int addRan =  sc.nextInt();
		//랜선 길이를 담을 리스트
		List<Integer> ranList = new ArrayList<>();
		
		int sum = 0;
		
		for(int i = 0; i < defRan ; i++) {
			int tempNum = sc.nextInt();
			sum += tempNum;
			ranList.add(tempNum);
		}
		
		//모든 랜선의 길이를 최종 갯수로 나눈다
		int length = sum / addRan;
		
		int count = 1000000;
		
		while(count >  addRan) {
			if(count == 1000000) {
				count = 0;
			}else {
				length -= 10;
			}
			for(int i = 0; i < ranList.size(); i++) {
				count += ranList.get(i) / length;
			}
		}
		//주어진 랜선 길이 값 일치 할때(하지만 최댓값이 아님)
		for(int i = 0; i < 10; i++) {
			
		}
		
	}
	
}
