package algostudy.sujin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 카카오 코드 페스티벌 2018 예선 
// 상금헌터
public class BOJ15953 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			int prizeA = 0;
			int prizeB = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());

			if(A==1) {
				prizeA = 5000000;
			} else if(A>=2 && A<=3) {
				prizeA = 3000000;
			} else if(A>=4 && A<=6) {
				prizeA = 2000000;
			} else if(A>=7 && A<=10) {
				prizeA = 500000;
			} else if(A>=11 && A<=15) {
				prizeA = 300000;
			} else if(A>=16 && A<=21) {
				prizeA = 100000;
			}
			if(B==1) {
				prizeB = 5120000;
			} else if(B>=2 && B<=3) {
				prizeB = 2560000;
			} else if(B>=4 && B<=7) {
				prizeB = 1280000;
			} else if(B>=8 && B<=15) {
				prizeB = 640000;
			} else if(B>=16 && B<=31) {
				prizeB = 320000;
			}
			System.out.println(prizeA + prizeB);
		}
		
	}
}
