package algostudy.eunbee.algoritm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_3412 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int test = Integer.parseInt(sc.nextLine());
		List<List> testList = new ArrayList<>();
		for(int i = 0; i< test; i++) {
			int testCase = Integer.parseInt(sc.nextLine());
			List<String> testCaseList = new ArrayList<>();
			for(int j = 0; j < testCase; j++) {
				testCaseList.add(sc.nextLine());
			}
			testList.add(testCaseList);
		}
		
		for(int i = 0; i < testList.size(); i++) {
			System.out.println(getCases(testList.get(i)));
		}
		
		
	}
	
	public static int getCases(List<String> list) {
		int score = 0;
		for(int i = 0; i <list.size(); i++) {
			int x = Integer.parseInt(list.get(i).split(" ")[0]);
			int y = Integer.parseInt(list.get(i).split(" ")[1]);
			score += lengthCount(Math.abs(x),Math.abs(y));
		}
		return score;
		
	}
	
	public static int lengthCount(int x, int y) {
		double length = Math.sqrt((x*x)+(y*y));
		int point = 0;
		if(length ==0 ) {
			point = 20;
		}else {
			for(int i = 1 ; i <= 10; i++) {
				int ow = i*20;
				if( ow >= length) {
					point = ow;
					break;
				}
				if(i == 10 && ow <length) {
					point = 20*11;
				}
			}
			
		}
		return Math.abs((point /20)-11);
	}
	
}
