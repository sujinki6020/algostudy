package algostudy.eunbee.algoritm;

import java.util.Scanner;

public class BOJ_4435 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = Integer.parseInt(sc.nextLine());
		
		String result = "No victor on this battle field";
		String index = "";
		for(int i = 1; i <= num; i++) {
			
			int[] gan = {1,2,3,3,4,10};
			int[] sau = {1,2,2,2,3,5,10};
			int gSum = getSum(sc.nextLine().split(" "), gan);
			int sSum = getSum(sc.nextLine().split(" "), sau);
			
			if(gSum > sSum) result = "Good triumphs over Evil";
			if(gSum < sSum) result = "Evil eradicates all trace of Good";
			
			System.out.println("Battle "+ i +": "+ result);
			result = "No victor on this battle field";
		}
	}
	
	public static int getSum(String[] num, int[] scores) {
		int sum = 0;
		for(int i =0; i < num.length; i++) {
			sum += Integer.parseInt(num[i]) * scores[i];
		}
		return sum;
	}

}
