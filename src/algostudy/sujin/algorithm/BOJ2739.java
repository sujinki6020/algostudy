package algostudy.sujin.algorithm;

import java.util.Scanner;

// 구구단
public class BOJ2739 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		
		if(N>=1 && N<=9) {
			for(int i=1; i<=9; i++) {
				System.out.printf("%d * %d = %d\n", N, i, N*i);
			}
		}
	}
}
