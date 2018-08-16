package algostudy.sujin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ10817 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		// sort
//		int[] nums = {A,B,C};
//		Arrays.sort(nums);
//		System.out.println(nums[1]);
		
		// if
		if(A>B && B>C && A>C) {
			System.out.println(B);
		} else if(A>B && B<C && A>C) {
			System.out.println(C);
		} else if(B>A && B>C && A>C) {
			System.out.println(A);
		} else if(B>A && B>C && A<C) {
			System.out.println(C);
		} else if(C>A && C>B && A>B) {
			System.out.println(A);
		} else if(C>A && C>B && A<B) {
			System.out.println(B);
		} else if(A==B && A>C) {
			System.out.println(A);
		} else if(A==B && A<C) {
			System.out.println(A);
		} else if(B==C && A>B) {
			System.out.println(B);
		} else if(B==C && A<B) {
			System.out.println(B);
		} else if(A==C && A>B) {
			System.out.println(A);
		} else if(A==C && A<B) {
			System.out.println(A);
		} else if(A==B && B==C && C==A) {
			System.out.println(A);
		}
	}
}
