package algostudy.eunbee.algoritm;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HRK_JourneyMoon {

    // Complete the journeyToMoon function below.
    static int journeyToMoon(int n, int[][] astronaut) {
    	//n: 사람수 -배열
    	
    	List<Integer> nList = getNList(n);
    	
    	//리스트를 담을 리스트
    	List<List<Integer>> lList = new ArrayList<>();
    	
    	for(int i = 0; i <astronaut.length; i++) {
    		int key = 0;
    		
    		int id = astronaut[i][0];
    		int id2 = astronaut[i][1];
    		
    		if(nList.contains(id) || nList.contains(id2)) {
    			//아직 불려진적이 없다
    			List<Integer> list = new ArrayList<>();
    			list.add(id);
    			list.add(id2);
    			
    			lList.add(list);
    			
    			//nList에서 요소 지우기
    			nList.remove(id);
    			nList.remove(id2);
    			
    		}else {
    			//앞에서 이미 불려진적이 있다
    		}
    		
    		
    			
    	}
    	
    	return 0;
    }
    public static List<Integer> getNList(int n){
    	List<Integer> list = new ArrayList<>();
    	for(int i = 0; i < n; i++) {
    		list.add(i);
    	}
    	return list;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] np = scanner.nextLine().split(" ");

        int n = Integer.parseInt(np[0]);

        int p = Integer.parseInt(np[1]);

        int[][] astronaut = new int[p][2];

        for (int i = 0; i < p; i++) {
            String[] astronautRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int astronautItem = Integer.parseInt(astronautRowItems[j]);
                astronaut[i][j] = astronautItem;
            }
        }

        int result = journeyToMoon(n, astronaut);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

