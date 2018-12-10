package algostudy.eunbee.algoritm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_3412 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		List<List> testList = new ArrayList<>();
		for(int i = 0; i< test; i++) {
			int testCase = sc.nextInt();
			List<String> testCaseList = new ArrayList<>();
			for(int j = 0; j < testCase; j++) {
				testCaseList.add(sc.nextLine());
			}
			testList.add(testCaseList);
		}
		
		for(int i = 0; i < testList.size(); i++) {
			getCases(testList.get(i));
		}
		
		
	}
	
	public static void getCases(List<String> list) {
		int score = 0;
		for(int i = 0; i <list.size(); i++) {
			int x = Integer.parseInt(list.get(i).split(" ")[0]);
			int y = Integer.parseInt(list.get(i).split(" ")[1]);
			score += lengthCount(x,y);
		}
		System.out.println(score);
		
	}
	
	public static int lengthCount(int x, int y) {
		double length = Math.sqrt((x*x)+(y*y));
		int score = 0;
		for(int i = 0 ; i < 10; i *=20) {
			if( i > length) {
				score = i;
				break;
			}
			
		}
		return (score /20)-11;
	}
	
}
