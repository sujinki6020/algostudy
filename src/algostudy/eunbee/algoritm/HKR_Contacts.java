package algostudy.eunbee.algoritm;

import java.io.*;
import java.util.*;

public class HKR_Contacts {

    static int[] contacts(String[][] queries) {

        List<String> ctntList = new ArrayList<>();
        List<Integer> resultList = new ArrayList<>();
        for(int i = 0; i < queries.length; i++) {
            String cmd = queries[i][0];
            String content= queries[i][1];

            if(cmd.equals("add")) ctntList.add(content);
            if(cmd.equals("find")) resultList.add(findContent(ctntList,content));
        }
        int[] result = resultList.stream().mapToInt(i->i).toArray();
        return result;
    }


    public static int findContent(List<String> ctntList, String content) {
        int result = 0;

        for(String ctnt : ctntList){
            int length = content.length();
            int index = 0;



            for(int i = 0; i < length;i++){
                if(length == index) {
                    result++;
                    break;
                }
                if(ctnt.charAt(i)== content.charAt(index)){
                    index++;
                    for(int j = i+1; j < i+length; j++){
                        if(ctnt.charAt(j) != content.charAt(index)) {
                            index = 0;
                            break;
                        }
                        index++;
                    }
                };
            }

        }


        result = 0;
        for(String ctnt : ctntList){
            if(ctnt.contains(content))result++;
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int queriesRows = Integer.parseInt(scanner.nextLine().trim());

        String[][] queries = new String[queriesRows][2];

        for (int queriesRowItr = 0; queriesRowItr < queriesRows; queriesRowItr++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");

            for (int queriesColumnItr = 0; queriesColumnItr < 2; queriesColumnItr++) {
                String queriesItem = queriesRowItems[queriesColumnItr];
                queries[queriesRowItr][queriesColumnItr] = queriesItem;
            }
        }

        int[] result = contacts(queries);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bufferedWriter.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}

