package algostudy.junga;

import java.util.Arrays;
import java.util.Scanner;

public class GraphTest {
	

	public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);
	        
	        int total = 0;
	        int[] array = new int[9];
	        boolean check = false;
	        for(int i=0; i < array.length; i++) {
	            int input = Integer.parseInt(scan.nextLine().trim());
	            array[i] = input;
	            total += input;
	        }
	        
	        Arrays.sort(array);
	        
	        for(int i=0; i < 9; i++) {
	            if(check) break;
	            for(int j=0; j < 9; j++) {
	                
	                if(i == j) {
	                    continue;
	                }
	                
	                int a = array[i];
	                int b = array[j];
	                
	                if(total - a - b == 100) {
	                    array[i] = 0;
	                    array[j] = 0;
	                    
	                    check = true;
	                    break;
	                }
	            }
	        }
	        
	        
	        
	        for(int i=0; i < 9; i++) {
	            if(array[i] != 0) {
	                System.out.println(array[i]);
	            }
	        }
	        
	    }


	}
