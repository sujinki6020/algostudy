package algostudy.junga.baekjoon;

// 참고 - http://118k.tistory.com/483 

import java.util.Scanner;

public class Baek9251 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		// 새로 만든 배열 
		int[][] arr = new int[a.length()+1][b.length()+1];
		for(int x=1; x<=a.length(); x++) {
			char c1 = a.charAt(x-1);
			for(int y=1; y<=b.length(); y++) {
				char c2 = b.charAt(y-1);
				if(c1 == c2) 
					arr[x][y] = arr[x-1][y-1]+1;
				else {
					arr[x][y] = Math.min(arr[x-1][y],arr[x][y-1]);
				}
			}
		}
		System.out.println(arr[a.length()][b.length()]);
	}
}
