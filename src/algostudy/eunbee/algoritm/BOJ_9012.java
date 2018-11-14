package algostudy.eunbee.algoritm;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_9012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = Integer.parseInt(sc.nextLine());
		System.out.println(sc.nextLine());
		int index = 0 , left = 1, right = 1;
		
		String[] resultArr = new String[rows]; //yes No 들어갈 배열
		ArrayList<String> vpsArr = new ArrayList<>(); //괄호가 들어갈 arrayList
		String result = "NO";
		
		for(int i = 0; i < rows; i++) {
			vpsArr.add(sc.nextLine());
			System.out.println(sc.nextLine());
		}
		
			if(vpsArr.get(0).equals("(") && vpsArr.get(vpsArr.size()-1).equals("")) { //배열의 앞이 "(" 뒤가 ")"동시에 만족시킬때
			for(int i = 0; i < vpsArr.size(); i++) {
					switch(vpsArr.get(i)) {
					case"(": left++;
					case")": right++;
					}
				}
			if(left == right) {
				result = "YES";
			}
			resultArr[index] = result;
			}
			vpsArr.clear();
			index++; 
		System.out.println(result);
			
		
	}
}
