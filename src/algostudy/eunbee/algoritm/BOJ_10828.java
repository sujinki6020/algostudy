package algostudy.eunbee.algoritm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 스택 구하기 
 *
 */
public class BOJ_10828 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer count = Integer.parseInt(sc.nextLine());
		ArrayList<String> InputArr = setInputInfo(count);
		
		makeStack(InputArr, count);
		
	}
	public static ArrayList<String> setInputInfo(int count) {
		Scanner sc = new Scanner(System.in);
		//명령 저장하는 배열
		ArrayList<String> InputArr = new ArrayList<>();
		
		//내용입력받아서 배열에 저장
		for(int i = 0 ; i < count ; i++) {
			InputArr.add(sc.nextLine());
		}
		return InputArr;
	}
	
	public static void makeStack(ArrayList<String> InputArr, int count) {
		
		//stack
		ArrayList<Integer> stackArr = new ArrayList<>();
		
		//배열에 저장된 내용 꺼내서 처리
		for(int i = 0 ; i < count ; i++) {
			String input = InputArr.get(i);
			switch(input.substring(0, 2)) {
			case "pu":
				stackArr.add(Integer.parseInt(input.split(" ")[1]));
				break;
			case "po":
				int popResult = -1;
				int size = stackArr.size();
				if(size > 0) {
					popResult = stackArr.get(size-1);
					stackArr.remove(size-1);
				}
				System.out.println(popResult);
				break;
			case "si": 
				System.out.println(stackArr.size());
				break;
			case "em": 
				int emptyResult = 0;
				if(stackArr.isEmpty()) {
					emptyResult = 1;
				}
				System.out.println(emptyResult);
				break;
			case "to": 
				int result = -1;
				if(stackArr.size() > 0) {
					result = stackArr.get(stackArr.size()-1);
				}
				System.out.println(result);
				break;
			}
		}
		
	}

}
