package algostudy.eunbee.algoritm;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HKR_candies {

    // Complete the candies function below.
    static long candies(int n, int[] arr) {
    	Stack<Integer> candies = new Stack<>();
    	
    	candies.push(1);
    	int decCnt = 1;
    	
    	for(int i=1; i < n; i++) {
    		if(arr[i-1] > arr[i]) {
    			decCnt++;
    		}
    		if(arr[i-1] == arr[i]) {
    			if(decCnt > 1) {
    				candies = makeStack(decCnt, candies);
    				decCnt = 1;
    			}
    			candies.push(1);
    		}
    		if(arr[i-1] < arr[i]) {
    			if(decCnt > 1) {
    				candies = makeStack(decCnt, candies);
    				decCnt = 1;
    			}
    				candies.push(candies.peek()+1);
    		}
    		if(i == n-1) {
    			candies = makeStack(decCnt, candies);
    		}
    	}
    	
    	long sumCan = (long)0;
    	for(Integer candy : candies) {
    		sumCan += (long)candy;
    	}
    
    	return sumCan;
    }
    public static Stack<Integer> makeStack(int decCnt, Stack<Integer> stack) {
    	if(stack.peek() > decCnt) {
    		stack.push(stack.peek());
    		decCnt -= 1;
    	}
    	stack.pop();
    	for(int i = decCnt; i > 0; i--) {
    		stack.push(i);
    	}
    	return stack;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            int arrItem = scanner.nextInt();
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//            arr[i] = arrItem;
//        }
    	
    	int n =10;
    	int[] arr = {10,9,8,7,6,5,4,3,2,1};
        long result = candies(n, arr);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}

