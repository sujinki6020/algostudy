package algostudy.eunbee.algoritm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_4436 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			long n = sc.nextInt();
			
			List<Integer> unCheckedList = new ArrayList<Integer>() {
				{for(int i=0; i<10; i++) {
					add(i);
					}
				}
			};
			int k = 1;
			while(!unCheckedList.isEmpty()) {
				
				Long multipleNum = n*k;
				int length = (int) (Math.log10(multipleNum)); 
				
				for(int i = length+1; i > 0; i--) {
					int quo = (int) (multipleNum / Math.pow(10, i-1));
					
					if(unCheckedList.contains(quo)) {
						unCheckedList.remove(unCheckedList.indexOf(quo));
					}
					
					multipleNum = (long) (multipleNum % Math.pow(10, i-1));
				}
				k++;
			}
			System.out.println(k-1);
			
		}
				
	}

}
