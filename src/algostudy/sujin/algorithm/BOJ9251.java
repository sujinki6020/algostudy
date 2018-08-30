package algostudy.sujin.algorithm;

import java.util.Scanner;

public class BOJ9251 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String X = sc.nextLine();
		String Y = sc.nextLine();
		int[][] lcs = new int[1001][1001];
		
		for(int i=1; i<=X.length(); i++) {
			for(int j=1; j<=Y.length(); j++) {
					if(X.charAt(i-1)==Y.charAt(j-1)) {
					lcs[i][j] = lcs[i-1][j-1] + 1;
				} else {
					lcs[i][j] = Math.max(lcs[i][j-1], lcs[i-1][j]);
				}
			}
		}
		System.out.println(lcs[X.length()][Y.length()]);
	}
}
