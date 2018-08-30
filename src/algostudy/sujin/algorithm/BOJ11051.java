package algostudy.sujin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11051 {
	static int[][] binom = new int[1001][1001];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		System.out.println(binomial(N,K));
	}
	
	private static int binomial(int N, int K) {
		if(N==K || K==0) {
			return binom[N][K]=1;
		} else if(binom[N][K] > 0) {
			return binom[N][K];
		}
		
		binom[N][K] = binomial(N-1,K-1) + binomial(N-1,K);
		return binom[N][K]%=10007;
	}
}
