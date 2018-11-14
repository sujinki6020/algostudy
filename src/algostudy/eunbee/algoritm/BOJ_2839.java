package algostudy.eunbee.algoritm;

import java.util.*;

public class BOJ_2839 {
	public static void main(String[] args) {
//		while(true) {
			
		int total = -1;
		
		Scanner sc = new Scanner(System.in);
		int sugar = sc.nextInt();
		
		if(sugar%5 == 0) {
			total = sugar/5;
		}else{
			if( (sugar%5)%3 ==0 ) {
				total = sugar/5 + ((sugar%5)/3);
			}else {
				for(int i=sugar/5; i>0; i--) {
					if((sugar - (5*i))%3 ==0){
						total = i + (sugar - (5*i))/3;
						break;
					}else if(sugar%3 ==0){
						total = sugar/3;
					}
				}
			}
		}
		System.out.println(total);
		}
		
//	}
}
