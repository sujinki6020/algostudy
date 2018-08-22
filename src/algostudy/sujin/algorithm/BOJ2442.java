package algostudy.sujin.algorithm;

import java.util.Scanner;

public class BOJ2442 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		sc.close();
		for(int i=0; i<N; i++) {
			for(int j=0; j<N-1-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
