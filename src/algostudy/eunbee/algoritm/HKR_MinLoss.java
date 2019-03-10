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
    static int minimumLoss(long[] price) {
    	
    	Arrays.sort(price);
    	int min = 100000;
    	for(int i = 1; i < price.length; i++) {
    		int interval = (int) (price[i]-price[i-1]);
    		if(interval < min) {
    			for(int j = 0; j < price.length; j++) {
    				
    			}
    			min = interval; 
    		}
    	}
    	
    	return min;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long[] price = new long[n];

        String[] priceItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            long priceItem = Long.parseLong(priceItems[i]);
            price[i] = priceItem;
        }

        int result = minimumLoss(price);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

