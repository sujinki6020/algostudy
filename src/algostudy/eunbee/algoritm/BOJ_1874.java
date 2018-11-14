package algostudy.eunbee.algoritm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 *스택 수열 
 *df
 */
public class BOJ_1874 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Integer> st = new Stack<>(); //숫자를 넣을 스택 
		ArrayList arrList = new ArrayList(); //+, -를 넣을 ArrayList
		int index = 0; //수열 index
		
		int n = Integer.parseInt(in.readLine());
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(in.readLine());	
		}

		for(int  i = 1; i <= n; i++) {
			st.add(i);
			arrList.add("+"); //숫자를 넣는다.
			
			
			while(!st.isEmpty() && arr[index] == (int)st.peek()) {//스택이 비어있지 않으면서, 스택 꼭대기
				index++; //다음 수열로 넘어간다.
				st.pop();
				arrList.add("-");
			}
		}
		if(!st.isEmpty()) {
			System.out.println("NO");
		}else {
			for(int i  = 0; i < arrList.size(); i++) {
				System.out.println(arrList.get(i));
			}
		}
		
	}
	
}
