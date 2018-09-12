package algostudy.sujin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class KakaoSecretMap {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr1 = new int[N];
		int[] arr2 = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		
		solution(N, arr1, arr2);
	}
	
	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		for(int i=0; i<n; i++) {
			answer[i] = Integer.toBinaryString(arr1[i]|arr2[i]).replace("0", " ").replace("1", "#");
		}
		System.out.println(Arrays.toString(answer));
		return answer;
	}
 }
