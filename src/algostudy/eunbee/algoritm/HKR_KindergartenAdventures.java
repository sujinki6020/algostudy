package algostudy.eunbee.algoritm;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class HKR_KindergartenAdventures {

    /*
     * Complete the solve function below.
     */
    static int solve(int[] t) {
    	int min = getMin(t)[0];
//    	int mincount= getMin(t)[1];
    	List<Integer> passed = new ArrayList<>();
    	
    	//새로 생길 리스트들을 담을 멀티 리스트
    	List<Map<String, Integer>> multiList = new ArrayList<>();
    	
    	for(int i = 0; i < t.length; i++) {
    		//학생마다 남은 시간
    		int num = t[i];
    		//걷는 그림의 수
    		int paintCount = 1;
    		passed.add(num);
    		//최소값과 같을때
    		if(num == min) {
    			//지나온 길 수정
    			int length = passed.size();
    			for(int j =0; j <min; j++) {
    				passed.remove(length-j);
    			}
    			makeList(multiList, passed, i, paintCount);
    		}else {
    			for(int j =1; j <=multiList.size(); j++) {
    				Map<String, Integer> getMap= multiList.get(j);
    				int indexHad = getMap.get("index");
    				int paintHad = getMap.get("paintCount");
    				if( num - (indexHad+i) ==0 ) {
    					getMap.put("paintCount", paintHad);
    				}
    			}
    		}
    	}
    	
        return 0;

    }
    
    public static void makeList(List<Map<String,Integer>> multiList, List<Integer> passed, int index, int paintCount) {
    	//이전 값들 중에 0이 되는 값을 체크해서 카운트
    	for(int i = 0; i < passed.size(); i++) {
    		int timeOut = index+i;
    		if(passed.get(i)- timeOut == 0) paintCount++;
    	}
    	Map<String, Integer> caseMap = new HashMap<>();
    	caseMap.put("index", index);
    	caseMap.put("paintCount", paintCount);
    	
    	multiList.add(caseMap);
    }
    public static int[] getMin(int[] arr) {
    	int min = arr.length;
    	int count = 0;
    	for(int i = 0; i < arr.length; i++) {
    		if(arr[i] < min) {
    			count = 0;
    			min = arr[i];
    		}else {
    			if(arr[i] == min) {
    				count++;
    			}
    		}
    	}
    	int[] result = {min, count};
    	return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int tCount = Integer.parseInt(scanner.nextLine().trim());

        int[] t = new int[tCount];

        String[] tItems = scanner.nextLine().split(" ");

        for (int tItr = 0; tItr < tCount; tItr++) {
            int tItem = Integer.parseInt(tItems[tItr].trim());
            t[tItr] = tItem;
        }

        int id = solve(t);

        bufferedWriter.write(String.valueOf(id));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}

