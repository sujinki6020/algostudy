package algostudy.sujin.algorithm;

import java.util.Scanner;

public class BOJ2839 {
	static int n = 0;
	static int cnt = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		recur(n);
		System.out.println(cnt);
	}
	
	private static void recur(int n) {
		if (n>0) {
			if(n%5==0) {
				cnt = n/5;
			} else if(n%3==0) {
				n -= 3;
				cnt++;
				if(n%5==0) {
					cnt += n/5;
				} else {
					recur(n);
				}
			} else {
				n -= 3;
				cnt++;
				if(n%5==0) {
					cnt += n/5;
				} else {
					recur(n);
				}
			}
		} else {
			cnt = -1;
		}
	}

}
