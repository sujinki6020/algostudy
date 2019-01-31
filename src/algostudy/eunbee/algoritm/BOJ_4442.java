package algostudy.eunbee.algoritm;

import java.util.HashMap;
import java.util.Scanner;

public class BOJ_4442 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			int num = Integer.parseInt(sc.nextLine());
			
			if(num == 0) {
				break;
			}
			
			String[] pSeat = new String[num];
			String[] sSeat = new String[num];
			HashMap<String, String> map = new HashMap<>();
			
			pSeat = sc.nextLine().split(" ");
			sSeat = sc.nextLine().split(" ");
			for(int i = 0; i < num; i++) {
				map.put(pSeat[i], sSeat[i]);
			}
			
			int same = 0;
			int pair = 0;
			int diff = 0;
			
			//1.key와 value 값이 일치하는 경우
			//2-1.두 자리를 교환하면 제자리로 가는 경우
			//2-2. 완전히 다른경우
			for(String key : map.keySet()) {
				if(map.get(key).equals(key)) {
					same++;
				}
				else if(key.equals(map.get(map.get(key)))) {
					pair++;
					
				}else {
					diff++;
				}
			}
			int result = 0;
			
			//자리수가 다른것이 하나라도 있을때
			if(diff != 0 || pair != 0) {
				//자리수 다른 곳이 모두 짝을 이루고 있을때
				if(diff == 0 && pair != 0) {
					result += pair/2;
				}else {
				//자리 다른곳이 짝을 이루고 있거나 아닐때를 모두 충족할 때
					if(pair != 0) {
						result = (pair/2) + (diff-1);
					}else {
						result = diff-1;
					}
				}
			}
			
			System.out.println(result);
		
		}
		
		
	}
}	
