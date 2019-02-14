package algostudy.eunbee.algoritm;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class HKR_KindergartenAdvanture2 {

      /*
     * Complete the solve function below.
     */
    static int solve(int[] t) {
    	List<Integer> indexList = new ArrayList<>();
    	for(int i = 0; i < t.length; i++) {
    		if(t[i] > i) indexList.add(i);
    	}
    	int max = 0;
    	int result = 0;
    	
    	for(int i = 0; i < indexList.size(); i++) {
    		i = indexList.get(i);
    		int paints = getPaintCount(i, t);
    		if(paints > max) {
    			max = paints;
    			result = i+1;
    		}
    	}
        return result;

    }
    public static int getPaintCount(int index, int[] arr) {
    	int paintCount =0;
    	for(int i = 0; i < arr.length-index; i++) {
    		if(arr[index+i] - i <= 0) paintCount++;
    	}
    	for(int i = 0; i < index; i++) {
    		if(arr[i] - (i + arr.length-index) <= 0) paintCount++;
    	}
    	return paintCount;
    };
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int tCount = Integer.parseInt(scanner.nextLine().trim());
//
//        int[] t = new int[tCount];
//
//        String[] tItems = scanner.nextLine().split(" ");
//
//        for (int tItr = 0; tItr < tCount; tItr++) {
//            int tItem = Integer.parseInt(tItems[tItr].trim());
//            t[tItr] = tItem;
//        }
    	int[] arr = {
    			1,0,0
    	};
        int id = solve(arr);
        
        System.out.println(id);
//
//        bufferedWriter.write(String.valueOf(id));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
    }
}
