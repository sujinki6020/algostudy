package algostudy.eunbee.algoritm;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HRK_MagicSquare {

    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {
    	
    	int min = 45;
    	
    	for(int i = 1; i<=8; i++) {
    		int[][] ms = getMagicSquare(i);
    		int sum = 0;
    		
    		for(int j = 0; j <3; j++) {
    			for(int k = 0; k < 3; k++) {
    				if(s[j][k] != ms[j][k]) {
    					sum += Math.abs(s[j][k] - ms[j][k]);
    				}
    			}
    		}
    		
    		if(sum < min) min = sum;
    	}
    	
    	return min;

    }
    public static int[][] getMagicSquare(int key) {
    	int[][] ms1 = {{4,9,2},{3,5,7},{8,1,6}};
        int[][] ms2 = {{2,9,4},{7,5,3},{6,1,8}};
        int[][] ms3 = {{8,1,6},{3,5,7},{4,9,2}};
        int[][] ms4 = {{6,1,8},{7,5,3},{2,9,4}};
        
        int[][] ms5 = {{2,7,6},{9,5,1},{4,3,8}};
        int[][] ms6 = {{6,7,2},{1,5,9},{8,3,4}};
        int[][] ms7 = {{4,3,8},{9,5,1},{2,7,6}};
        int[][] ms8 = {{8,3,4},{1,5,9},{6,7,2}};
        
        Map<Integer, int[][]> map = new HashMap<>();
        	map.put(1, ms1);
        	map.put(2, ms2);
        	map.put(3, ms3);
        	map.put(4, ms4);
        	map.put(5, ms5);
        	map.put(6, ms6);
        	map.put(7, ms7);
        	map.put(8, ms8);
        return map.get(key);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

//    	int [][] s = {{4,9,2},{3,5,7},{8,1,5}};
        int result = formingMagicSquare(s);
        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
    
}
