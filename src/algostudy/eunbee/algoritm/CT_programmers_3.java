package algostudy.eunbee.algoritm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CT_programmers_3 {
	
    public static int[] solution(int[] healths, int[][] items) {
    	Arrays.sort(healths);
    	List<Integer> list = new ArrayList<>();
    	
    	for(int i = healths.length-1; i >=0; i--) {
    		int max = 0;
    		int item = -1;
	    	for(int j = 0 ; j < items.length; j++) {
	    		if(items[j][1]-100 <= healths[i] && items[j][0] > max) {
	    			max = items[j][0];
	    			item =j;
	    		}
	    	}
	    	if(!list.contains(item)) {
	    		if(item != -1) list.add(item);
	    	}
    	}
    	int[] answer = new int[list.size()];
    	for(int i = 0; i < list.size(); i++) {
    		answer[i] = list.get(i);
    	}
    	
        return answer;
    }
    public static void main(String[] args) {
		int[] healths = {200, 120, 150};
		int[][] itens= {{30,100}, {500}, {300, 100}};
		System.out.println(solution(healths, itens));
	}

}
