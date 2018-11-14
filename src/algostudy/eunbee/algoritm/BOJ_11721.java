package algostudy.eunbee.algoritm;

import java.util.Scanner;

public class BOJ_11721 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		if(text.length() <= 10) {
			System.out.println(text);
		}else {
				for(int i = 0; i < text.length()/10; i++) {
					System.out.println( text.substring(10*i, 10*(i+1)));
				}
				if(text.length()%10!=0) {
					System.out.println( text.substring(text.length()-(text.length()%10), text.length()));
				}
		}
	}
}
