package algostudy.eunbee.algoritm;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class HKR_LSCReturns {

    /*
     * Complete the tutzkiAndLcs function below.
     */
    static int tutzkiAndLcs(String a, String b) {

    	List<char[]> aList = new ArrayList<>();
    	char[] tempInt = {a.charAt(0)};
    	aList.add(tempInt);
    	for(int i =1; i < a.length(); i++) {
//    		aList
    		
    	}
    	
         return 0;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int result = tutzkiAndLcs(a, b);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
