package algostudy.eunbee.algoritm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BOJ_1149 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int houses =  sc.nextInt();
//		
//		List<Integer> rList = new ArrayList<>();
//		List<Integer> gList = new ArrayList<>();
//		List<Integer> bList = new ArrayList<>();
//		
//		for(int i = 0; i < houses; i++) {
//			rList.add(sc.nextInt());
//			gList.add(sc.nextInt());
//			bList.add(sc.nextInt());
//		}
//		Map<String, List<Integer>> map = new HashMap<>();
//		
//		map.put("R", rList);
//		map.put("G", gList);
//		map.put("B", bList);
//		
//		int result = colorSum(map, houses);
//		
//		System.out.println(result);
//		
//	}
//	
//	public static int colorSum(Map<String, List<Integer>> map, int houses) {
//		int sum =0;
//		int compare1 = 0;
//		int compare2 = 0;
//		
//		int minSum = 1000;
//			for(String key: map.keySet()) {
//				sum += map.get(key).get(0);
//				switch(key) {
//				case "R":
//					
//					compare1 += map.get("G").get(1);
//					compare1 += Math.min(map.get("R").get(2), map.get("B").get(2));	
//					
//					compare2 += map.get("B").get(1);
//					compare2 += Math.min(map.get("R").get(2), map.get("G").get(2));	
//					
//					break;
//				case "G":
//					
//					compare1 += map.get("R").get(1);
//					compare1 += Math.min(map.get("G").get(2), map.get("B").get(2));	
//					
//					compare2 += map.get("B").get(1);
//					compare2 += Math.min(map.get("R").get(2), map.get("G").get(2));	
//					break;
//				case "B":
//					
//					compare1 += map.get("G").get(1);
//					compare1 += Math.min(map.get("R").get(2), map.get("B").get(2));	
//					
//					compare2 += map.get("R").get(1);
//					compare2 += Math.min(map.get("B").get(2), map.get("G").get(2));	
//					break;
//					
//				}
//				compare1 +=sum;
//				compare2 +=sum;
//				minSum = Math.min( Math.min(compare1, compare2), minSum);
//				
//			}
//			
//		return minSum;
//	}

		static final int RED = 1;
		static final int GREEN = 2;
		static final int BLUE = 3;
		
		public static void main(String[] args) throws Exception{
			int N;
			int[][] RGB;
			int [][] dp;
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			N = Integer.parseInt(br.readLine());
			
			RGB = new int[N][3];
			
		}	
}
