package algostudy.eunbee.algoritm;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import com.sun.xml.internal.bind.util.Which;

public class HKR_AlmostedSorted {

    // Complete the almostSorted function below.
    static void almostSorted(int[] arr) {
    	String result = "no";
    	String cases = null;
    	
    	int prePreNum =arr[0];
    	int preNum =arr[1];
    	int startIndex = prePreNum>preNum? 1: 0;
    	
    	if(arr.length == 2 && arr[0] > arr[1]) {
    		result = "yes";
    		cases = "swap 1 2";
    	}
        for(int i = 2; i<arr.length; i++) {
        	if(cases == null) {
	        	if(prePreNum > preNum && preNum < arr[i]) {
	        		cases = "swap";
	        		i = i-1;
	        	}
	        	if(prePreNum > preNum && preNum > arr[i]) {
	        		cases = "reverse";
	        		i = i-1;
	        	}
	        	startIndex = i-2;
	        	prePreNum = preNum;
        	}
        	if(cases != null) {
        		
        	switch(cases){
        		case"swap":
        			if(preNum > arr[i]) {
//        				if( arr[i] >arr[startIndex-1] && arr[i]< arr[startIndex+1] && arr[i-1] < arr[startIndex]) {
        				if( arr[i] >arr[startIndex-1] && arr[i]<= arr[startIndex+1] && arr[i-1] < arr[startIndex]) {
        					result ="yes";
        					cases += " "+(startIndex+1)+" "+(i+1);
        				}
        			}
        			break;
        		case "reverse":
        			if(preNum < arr[i]) {
        				if( preNum >arr[startIndex-1] && preNum < arr[startIndex+1] && arr[startIndex] < arr[i]) {
        					result ="yes";
        					cases += " "+(startIndex+1)+" "+i;
        				}
        			}
        			break;
        		}
        	}
        	preNum = arr[i];
        }
        System.out.println(result);
        if(result.equals("yes")) System.out.println(cases);
    }


    public static void main(String[] args) {
//    	Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
////        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int[] arr = new int[n];
//
//        String arrItem = scanner.nextLine();
//        String[] arrItems = arrItem.split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = Integer.parseInt(arrItems[i]);
//        }
    	int[] arr = 
    		{
    				1 ,2, 3, 5, 4, 6
    		};
        almostSorted(arr);

//        scanner.close();
    }
}
