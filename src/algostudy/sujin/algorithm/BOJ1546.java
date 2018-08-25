package algostudy.sujin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1546 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] scores = new int[N];
		for(int i=0; i<N; i++) {
			scores[i] = Integer.parseInt(st.nextToken()); 
		}
		Arrays.sort(scores);
		int M = scores[N-1];
		double temp = 0;
		for(int j=0; j<N; j++) {
			temp += scores[j];
		}
		System.out.printf("%.2f",temp/M*100/N);
	}
}
