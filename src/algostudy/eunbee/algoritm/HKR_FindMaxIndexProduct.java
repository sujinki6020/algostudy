package algostudy.eunbee.algoritm;
import java.io.*;
import java.util.*;

public class HKR_FindMaxIndexProduct {

    public static long solve(int[] arr) {
        Stack<int[]> stack = new Stack<>();
        int[] initArr = {arr[0],1};
        stack.push(initArr);
        Long max = 0L;
        for(int i = 1; i < arr.length; i++){
            int prev = arr[i-1];
            int curr = arr[i];

            if(prev > curr){
                int[] arrInStack = {curr,i+1};
                stack.push(arrInStack);
            }
            else if( prev == curr){
                int[] getArr = stack.pop();
                getArr[1] =i+1;
                stack.push(getArr);
            }
            else{
                    while(stack.peek()[0] <= curr){
                        if(stack.peek()[0] != curr){
                            stack.pop();
                            if(stack.isEmpty()) break;
                            Long result = Long.valueOf(stack.peek()[1])*Long.valueOf(i+1);
                            max = Math.max(max, result);
                        }else{
                            stack.pop();
                        }
                        if(stack.isEmpty()) break;
                    }
                    int[] arrInStack = {curr, i+1};
                    stack.push(arrInStack);
            }
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[arrCount];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int arrItr = 0; arrItr < arrCount; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr]);
            arr[arrItr] = arrItem;
        }
        long result = solve(arr);
        System.out.print(result);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
