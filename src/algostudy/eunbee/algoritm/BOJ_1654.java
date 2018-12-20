package algostudy.eunbee.algoritm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_1654 {
	public static void main(String[] args) throws Exception{
//		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	        
//	        String[] firstLine = br.readLine().split(" ");
//	        long defRan = Integer.parseInt(firstLine[0]); // 가지고 있는 랜선의 개수
//	        long addRan = Integer.parseInt(firstLine[1]); // 필요한 랜선의 개수
		Scanner sc = new Scanner(System.in);
//		//기존 갯수
		long defRan = sc.nextLong();
//		//최종 갯수
		long addRan =  sc.nextLong();
		//랜선 길이를 담을 리스트
		List<Long> ranList = new ArrayList<>();
		
		long sum = 0;
		
		for(int i = 0; i < defRan ; i++) {
			long tempNum = sc.nextLong();
//			long tempNum = Integer.parseInt(br.readLine());
			sum += tempNum;
			ranList.add(tempNum);
		}
		
		//모든 랜선의 길이를 최종 갯수로 나눈다
		long length = sum / addRan;
		
		long count = 0;
		
	
		long digit = (long)Math.log10(length);//2
		
		long interval = 1;
		//한자리수가 아닐때
		if(digit != 1 || digit != 0) {
			for(int j = 0; j < digit-1; j++) {
				interval *= 10;
			}
		}
		
		while(count <  addRan) {
			if(count != 0) {
				length -= interval;
				count = 0;
			}
			for(int i = 0; i < ranList.size(); i++) {
				count += ranList.get(i) / length;
			}
		}
		
		
//		주어진 랜선 길이 값 일치 할때(하지만 최댓값이 아님)
		for(int i = 0; i < interval; i++) {
			//count 값이 떨어지는 포인트를 찾아야함
			length +=1;
			count = 0;
			for(Long ran : ranList) {
				count += ran / length;
			}
			if(count != addRan) {
				length -= 1;
				break;
			}
			
		}
		System.out.println(length);
		
	}
	
}
