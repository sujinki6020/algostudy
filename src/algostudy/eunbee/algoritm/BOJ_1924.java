package algostudy.eunbee.algoritm;

import java.util.Scanner;

public class BOJ_1924 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		int count = 0;
		if(month != 1) {
			for(int i = 1; i < month; i++) {
				switch(i) {
				case 4: case 6: case 9: case 11: 
					count += 30; break;
				case 2 :
					count +=28; break;
				default : 
					count += 31; break;
				}
			}
		}
		count += day;
		String week = "SUN";
		switch(count%7) {
		case 1: week = "MON"; break;
		case 2: week = "TUE"; break;
		case 3: week = "WED"; break;
		case 4: week = "THU"; break;
		case 5: week = "FRI"; break;
		case 6: week = "SAT"; break;
		}
		
		System.out.println(week);
	}
}
