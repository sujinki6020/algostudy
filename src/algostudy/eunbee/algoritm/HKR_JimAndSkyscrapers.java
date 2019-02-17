package algostudy.eunbee.algoritm;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class HKR_JimAndSkyscrapers {

   // Complete the solve function below.
    static Long solve(Long[] arr) {
        Long sum = (long) 0;
        
        Long min = arr[0];
        Long max = arr[0];
        
        Map<Long, Long> map = new HashMap<>();
        map.put(arr[0], (long) 1);
        
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] >= min && arr[i] < max) {
                if(map.containsKey(arr[i])) {
                    map.put(arr[i], map.get(arr[i])+1);
                }else {
                    map.put(arr[i], (long) 1);
                }
                
                List<Long> removeIndex = new ArrayList<>();
                for(Long key : map.keySet()) {
                    if(arr[i] > key) {
                        sum += countPaths(map.get(key));
                        removeIndex.add(key);
                    }
                }
                for(Long key : removeIndex) {
                    map.remove(key);
                }
                min = arr[i];
                
            }else {
                if(arr[i] < min) min = arr[i];
                if(arr[i] >= max) max = arr[i]; 
                
                map.put(arr[i], (long) 1);
            }
        }
        
        for(Long key : map.keySet()) {
            if(map.get(key) > 1) sum+=countPaths(map.get(key));
        }
        
        return sum;
    }
    public static Long countPaths(Long scr) {
        Long result = (long) 0;
        if(scr >1) {
            result = scr*(scr-1);
        }
        return result;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        Long[] arr = new Long[arrCount];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int arrItr = 0; arrItr < arrCount; arrItr++) {
            Long arrItem = Long.parseLong(arrItems[arrItr]);
            arr[arrItr] = arrItem;
        }

        Long result = solve(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
