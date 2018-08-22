package algostudy.junga;

import java.util.Scanner;

public class Kakao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		for(int i=1; i<=num; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int aMoney = 0;
			int bMoney = 0;
			if(1 <= a && a <= 100) {
				if(1 == a) {
					aMoney = 5000000;
				}if(2 <= a && a <=3) {
					aMoney = 3000000;
				}if(4 <= a && a <= 6) {
					aMoney = 2000000;
				}if(7 <= a && a <= 10) {
					aMoney = 500000;
				}if(11 <= a && a <= 15) {
					aMoney = 300000;
				}if(16 <= a && a <= 21) {
					aMoney = 100000;
				}
			}else if( a== 0 && a > 100) {
				aMoney = 0;
			}
		if(1 <= b && b <= 64) {
			if(1 == b) {
				bMoney = 5120000;
			}if(2 <= b && b <= 3) {
				bMoney = 2560000;
			}if(4 <= b && b <= 7) {
				bMoney = 1280000;
			}if(8 <= b && b <= 15) {
				bMoney = 640000;				
			}if(16 <= b && b <= 31) {
				bMoney = 320000;								
			}else if (b==0 && b > 64) {
				bMoney = 0;
			}
		}
		System.out.println( aMoney + bMoney);
		}
				
		
	}

}
