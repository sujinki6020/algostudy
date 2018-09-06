package algostudy.sujin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ10828 {
	static int N;
	static ArrayList stack;
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		stack = new ArrayList<Integer>();
		
		while(N!=0) {
			String input = br.readLine();
			if(input.toLowerCase().contains("push")) {
				int n = Integer.parseInt(input.split(" ")[1]);
				push(n);
				N--;
			} else if(input.toLowerCase().contains("pop")) {
				System.out.println(pop());
				N--;
			} else if(input.toLowerCase().contains("size")) {
				System.out.println(size());
				N--;
			} else if(input.toLowerCase().contains("top")) {
				System.out.println(top());
				N--;
			} else if(input.toLowerCase().contains("empty")) {
				System.out.println(empty());
				N--;
			}
		}
	}
	
	public static void push(int n) {
		stack.add(n);
	}
	
	public static int pop() {
		if(!stack.isEmpty()) {
			int num = (Integer) stack.get(stack.size() - 1); // 제일 위에 있는 숫자 꺼내기
			stack.remove(stack.size()-1);
			return num;
		} 
		return -1;
	}
	
	public static int size() {
		return stack.size();
	}
	
	public static int empty() {
		if(stack.isEmpty()) {
			return 1;
		}
		return 0;
	}
	
	public static int top() {
		if(stack.isEmpty()) {
			return -1;
		}
		int num = (Integer) stack.get(stack.size()-1);
		return num;
	}
	
}
