package algostudy.sujin.algorithm;

import java.util.Scanner;

// 별찍기1
// 시간 초과
public class BOJstar1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		sc.close();
		for(int i=0; i<N; i++) {
			for(int j=N-i; j<=N; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
