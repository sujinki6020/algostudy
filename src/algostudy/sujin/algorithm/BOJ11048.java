package algostudy.sujin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11048 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] candyMaps = new int[1001][1001];
		int[][] result = new int[1001][1001];
		for(int i=1; i<=N; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			for(int j=1; j<=M; j++) {
				candyMaps[i][j] =  Integer.parseInt(st1.nextToken());
			}
		}
		
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=M; j++) {
				result[i][j] = Math.max(result[i-1][j], Math.max(result[i][j-1], result[i-1][j-1])) + candyMaps[i][j];
			}
		}
		System.out.println(result[N][M]);
	}
}
