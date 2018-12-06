package algostudy.eunbee.algoritm;

import java.util.Scanner;

public class BOJ_1072 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long total = sc.nextLong();
		long win = sc.nextLong();
		long Z = win *1 /total *1;
		
		
		int addWin = 1;
		long count = 0;
		long rate = (win+1)/(total+1);
		System.out.println("rate" + rate);
		if(rate >1) {
			System.out.println(1);
		}else {
			count = 1 /(rate - Z);
			System.out.println(count);
		}
		
		
	}
}
