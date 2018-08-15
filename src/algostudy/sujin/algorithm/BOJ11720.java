package algostudy.sujin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		String input = st.nextToken();
		int add = 0;
		for(int i=0; i<N; i++) {
			System.out.println(input.charAt(i)-'0');
			add += input.charAt(i)-'0';
		}
		System.out.println(add);
	}
}
