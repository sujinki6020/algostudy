package algostudy.sujin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ4344 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine());
		
		for(int i=0; i<C; i++) {
		double avg = 0;
		int sum = 0;
		double cnt = 0;
		int[] scores = new int[1001];
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			scores = new int[N];
			for(int j=0; j<N; j++) {
				int score = Integer.parseInt(st.nextToken());
				sum += score;
				scores[j] = score;
			} 
			avg = sum/N;
			for(int k=0; k<N; k++) {
				if(scores[k] > avg) {
					cnt++;
				}
			}
			System.out.printf("%.3f%s\n", (cnt/N)*100, "%");
		}
	}
}
