package algostudy.eunbee.algoritm;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HKR_ClimbingLeaderboard {

    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
    	int[] result = new int[alice.length];
    	int index = scores.length-1;
    	int max = scores[0];
    	int[] rankArr = new int[scores.length];
    	
    	int rank = 1;
    	rankArr[0]=rank;
    	
    	for(int i=1; i < scores.length; i++) {
    		if(scores[i] == scores[i-1]) {
    			rankArr[i] = rank;
    		}else {
    			rank++;
    			rankArr[i] = rank;
    		}
    	}
    	
    	for(int i = 0; i < alice.length; i++) {
    		for(int j = index; j >=0; j--) {
    			if(alice[i] < scores[j]) {
    				result[i] = rankArr[j]+1;
    				index = j;
    				break;
    			}else {
    				if(alice[i] == scores[j]) {
    					result[i] = rankArr[j];
    					index = j;
    					break;
    				}
    				if(alice[i] > max) {
    					result[i] = 1;
    					break;
    				}
    			}
    		}
    	}
    	return result;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int scoresCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[scoresCount];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < scoresCount; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int aliceCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] alice = new int[aliceCount];

        String[] aliceItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < aliceCount; i++) {
            int aliceItem = Integer.parseInt(aliceItems[i]);
            alice[i] = aliceItem;
        }

        int[] result = climbingLeaderboard(scores, alice);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

