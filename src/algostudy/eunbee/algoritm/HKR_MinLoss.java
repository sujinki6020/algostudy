package algostudy.eunbee.algoritm;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HKR_MinLoss {

    // Complete the minimumLoss function below.
    static long minimumLoss(long[] price) {
    	List<Long> oriPrice = copyArray(price);
    	
    	Arrays.sort(price);
    	
    	long min = (long)999999999;
    	for(int i = 1; i < price.length; i++) {
    		long interval = price[i]-price[i-1];
    		if(interval < min)  {
//    			long indexRight = oriPrice.indexOf(price[i]); 
//    			long indexLeft = oriPrice.indexOf(price[i-1]); 
    			
    			if( oriPrice.indexOf(price[i]) < oriPrice.indexOf(price[i-1])) min = interval; 
    		}
    	}
    	
    	return min;
    }
    private static List<Long> copyArray(long[] prices){
    	List<Long> oriPrice = new ArrayList<>();
    	for(long price : prices) {
    		oriPrice.add(price);
    	}
    	return oriPrice;
    }

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        long[] price = new long[n];
//
//        String[] priceItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            long priceItem = Long.parseLong(priceItems[i]);
//            price[i] = priceItem;
//        }

    	long[] price = {(long)20, (long)7, (long)8, (long)2, (long)5};
        long result = minimumLoss(price);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}

