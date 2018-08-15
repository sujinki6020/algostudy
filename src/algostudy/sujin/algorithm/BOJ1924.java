package algostudy.sujin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.StringTokenizer;

public class BOJ1924 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
//		int count = 0;
		
		// 1. 배열 이용
//		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//		for(int i=0; i<x-1; i++) {
//			count += month[i];
//		}
//		
//		count += y;
//		
//		String day = "";
//		switch(count % 7) {
//		case 1:
//			day = "MON";
//			break;
//		case 2:
//			day = "TUE";
//			break;
//		case 3:
//			day = "WED";
//			break;
//		case 4:
//			day = "THU";
//			break;
//		case 5:
//			day = "FRI";
//			break;
//		case 6:
//			day = "SAT";
//			break;
//		case 7:
//			day = "SUN";
//			break;
//		}
//		System.out.println(day);
		
		// 2. Calendar API 이용
		Calendar c = Calendar.getInstance();
		
		c.set(2007,  x-1, y);
		
		int date = c.get(Calendar.DAY_OF_WEEK);
		
		String day = "";
		switch(date) {
		case 1:
			day = "SUN";
			break;
		case 2:
			day = "MON";
			break;
		case 3:
			day = "TUE";
			break;
		case 4:
			day = "WED";
			break;
		case 5:
			day = "THU";
			break;
		case 6:
			day = "FRI";
			break;
		case 7:
			day = "SAT";
			break;
		}
		System.out.println(day);
	}
}
