package algostudy.sujin.algorithm;

import java.util.Scanner;

public class BOJ11721 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int N = str.length();
		
		if(N<=100) {
			for(int i=0; i<N/10;i++) {
				System.out.println(str.substring(0, 10));
				str = str.substring(10);
			}
			System.out.println(str);
		}
	}
}
