package algostudy.sujin.algorithm;

import java.util.Scanner;

// 1부터 n까지 합
public class BOJ8393 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		
		if(N>=1 && N<=10000) {
			int sum = 0;
			for(int i=1; i<=N; i++) {
				sum += i;
			}
			System.out.println(sum);
		}
	}
}
