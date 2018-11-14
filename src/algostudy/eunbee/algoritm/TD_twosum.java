package algostudy.eunbee.algoritm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TD_twosum {
	 public static int[] findTwoSum(int[] list, int sum) {
		 List<int[]> answer = new ArrayList<>();
		 int index = 0; 
		 for(int j = 0; j < list.length; j++) {
			 if(index < list.length) {
				 
			 for(int i = index + 1; i < list.length; i++) {
				 if(list[index]+ list[i] == sum) {
					 int[] arr = {index, i};
					 answer.add(arr);
				 }
			 }
			 }
			 
			 index++;
		 }
		 Random r = new Random();
		 if(answer.isEmpty()) {
			 return null;
		 }
		 return answer.get(r.nextInt(answer.size()));
		 
//	        throw new UnsupportedOperationException("Waiting to be implemented.");
	    }

	    public static void main(String[] args) {
	        int[] indices = findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10);
	        if(indices != null) {
	            System.out.println(indices[0] + " " + indices[1]);
	        }
	    }
}
