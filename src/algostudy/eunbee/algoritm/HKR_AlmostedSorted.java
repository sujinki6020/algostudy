package algostudy.eunbee.algoritm;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HKR_AlmostedSorted {

    // Complete the almostSorted function below.
    static void almostSorted(int[] arr) {
    	String result = "no";
    	String cases = null;
    	
    	int prePreNum =arr[0];
    	int preNum =arr[1];
    	int startNum = prePreNum>preNum? prePreNum: 0;
    	int endNum = 0;
    	
    	if(arr.length == 2 && arr[0] < arr[1]) {
    		result = "yes";
    		cases = "swap"+arr[0] + arr[1];
    	}
        for(int i = 2; i<arr.length; i++) {
        	if(prePreNum > preNum && preNum < arr[i]) {
        		cases = "swap";
        	}
        	if(prePreNum > preNum && preNum < arr[i]) {
        		cases = "swap";
        	}
        	
        	if(startNum ==0 && preNum > arr[i] ) {
        		startNum = preNum;
        	}else if(startNum != 0) {
        		if(cases == null && preNum > arr[i]) {
        			cases = "reverse";
        			
        		}
        		if(cases.equals("swap") && (preNum > arr[i] || i == arr.length-1)) {
        			endNum = arr[i];
        		}
        	}
        	preNum = arr[i];
        }
        System.out.println(result);
        if(result.equals("yes")) System.out.println(cases);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        almostSorted(arr);

        scanner.close();
    }
}
