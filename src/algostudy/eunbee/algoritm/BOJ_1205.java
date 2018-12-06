package algostudy.eunbee.algoritm;

import java.util.Scanner;

public class BOJ_1205 {
	public static void main(String[] args) {
		putInputGetResult();
	}
	public static void putInputGetResult() {
		Scanner sc = new Scanner(System.in);
		Boolean full = false;
		
			String line = sc.nextLine();
				int N = Integer.parseInt(line.split(" ")[0]);
				int score = Integer.parseInt(line.split(" ")[1]);
				int P = Integer.parseInt(line.split(" ")[2]);
			line = sc.nextLine();
				int[] scoreArr = new int[N];
				for(int j = 0; j < N; j++) {
					scoreArr[j] = Integer.parseInt(line.split(" ")[j]);
			}
		if(N == P) {
			full = true;
		}
		getRank(score, scoreArr, full);
	}
	public static void getRank(int score, int[] scoreArr, Boolean full) {
		int rank = 0;
		for(int i = 0; i < scoreArr.length; i++) {
				if( score >= scoreArr[i]) {
					rank = i+1;
					//큰 값이 제일 작은 값인지 유무 확인
					if(full == true && i == scoreArr.length-1) {
						rank = -1;
					}
					break;
			}
			
		}
		System.out.println(rank);
	}
}
