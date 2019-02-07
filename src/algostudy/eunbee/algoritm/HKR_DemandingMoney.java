package algostudy.eunbee.algoritm;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class HKR_DemandingMoney {

    /*
     * Complete the demandingMoney function below.
     */
    static int[] demandingMoney(int[] money, int[][] roads) {
    	Map<Integer, List<Integer>> map = getMap(money.length, roads);
    	
    	List<List<Integer>>paths = new ArrayList<>();
    	List<Integer> passedPath = new ArrayList<>();
    	
    	for(int key : map.keySet()) {
    		getPath(passedPath, key, map.get(key), map);
    	}
    	
    	return null;

    }
    public static List<Integer> getPath(List<Integer> passedPath, int key, List<Integer> available, Map<Integer, List<Integer>> map) {
//    	List<Integer> result = null;
    	if(!available.isEmpty()) {
    		
    		for(int i = 0; i < available.size(); i++) { //4,5,6,7반복
    			
    			getPath(passedPath, key, available, map);
    		}
    	}else {
    		return passedPath;
    	}
		return passedPath;
    }
    public static Map<Integer, List<Integer>> getMap(int count, int[][] roads){
    	
    	Map<Integer, List<Integer>> map = getPreMap(count);
    	
    	for(int i=0; i < roads.length; i++) {
    		int preHouse = roads[i][0];
    		int nextHouse = roads[i][1];
    		
    		int small = preHouse<nextHouse? preHouse:nextHouse;
    		int large = preHouse>nextHouse? preHouse:nextHouse;
    		
    		map.get(small).remove((Object)large);
    	}
    	
    	return map;
    }
    
    public static Map<Integer, List<Integer>> getPreMap(int count){
    	
    	Map<Integer, List<Integer>> map = new HashMap<>();
    	for(int i = 1; i <= count; i++) {
    		
    		List<Integer> list = new ArrayList<>();
    		for(int j = i+1; j <=count; j++) {
    			list.add(j);
    		}
    		map.put(i, list);
    	}
    	return map;
    }
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] nm = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
//
//        int n = Integer.parseInt(nm[0]);
//
//        int m = Integer.parseInt(nm[1]);
//
//        int[] money = new int[n];
//
//        String[] moneyItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
//
//        for (int moneyItr = 0; moneyItr < n; moneyItr++) {
//            int moneyItem = Integer.parseInt(moneyItems[moneyItr]);
//            money[moneyItr] = moneyItem;
//        }
//
//        int[][] roads = new int[m][2];
//
//        for (int roadsRowItr = 0; roadsRowItr < m; roadsRowItr++) {
//            String[] roadsRowItems = scanner.nextLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
//
//            for (int roadsColumnItr = 0; roadsColumnItr < 2; roadsColumnItr++) {
//                int roadsItem = Integer.parseInt(roadsRowItems[roadsColumnItr]);
//                roads[roadsRowItr][roadsColumnItr] = roadsItem;
//            }
//        }
    	
        int[] money = {6,8,2};
        int[][] roads = {{1,2}, {2,3}};
        

        int[] result = demandingMoney(money, roads);
        System.out.println(result);

//        for (int resultItr = 0; resultItr < result.length; resultItr++) {
//            bufferedWriter.write(String.valueOf(result[resultItr]));
//
//            if (resultItr != result.length - 1) {
//                bufferedWriter.write(" ");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}

