package algostudy.sujin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11052 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] price = new int[N+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=1; i<=N; i++) {
			price[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] dp = new int[N+1];
		dp[0] = 0;
		dp[1] = price[1];
		
		for(int i=2; i<=N; i++) {
			dp[i] = price[i];
			for(int j=0; j<=i; j++) {
				dp[i] = Math.max(dp[i], dp[i-j]+dp[j]);
			}
		}
		System.out.println(dp[N]);
	}
}
