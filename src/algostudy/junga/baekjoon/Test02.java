package algostudy.junga.baekjoon;

import java.util.Scanner;

// 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
public class Test02 {
	public static void main(String[] args) {
		//N <= 100,000;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N<=100000 ) {
		for(int i=N; i > 0; i--) {
			System.out.println(i);
		}
		}else {
			System.out.println("출력불가능");
		}
	}

}
