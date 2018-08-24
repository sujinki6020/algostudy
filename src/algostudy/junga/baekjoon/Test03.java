package algostudy.junga.baekjoon;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇개?");
		int num = sc.nextInt();
		int result = fibo(num);
		System.out.println(result);
	}
	public static int fibo(int n) {
		if(n<=1) {
			return n;
		}else
			return fibo(n-2)+fibo(n-1);
	}
}
