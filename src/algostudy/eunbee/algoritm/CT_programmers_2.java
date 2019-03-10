package algostudy.eunbee.algoritm;

import java.util.Arrays;

public class CT_programmers_2 {
	public static void main(String[] args) {
		int[] people = {1,2};
		int[] tshirts = {1,2,3};
		System.out.println(solution(people, tshirts));
		
	}
    public static int solution(int[] people, int[] tshirts) {
    	Arrays.sort(people);
    	Arrays.sort(tshirts);
    	
    	int answer = 0;
    	for(int i = people.length-1; i >= 0; i--) {
    		for(int j =tshirts.length-1; j >= 0; j--) {
    			if(tshirts[j] != -1) {
	    			if(people[i] > tshirts[j]) break;
	    			if(people[i] <= tshirts[j]) {
	    				answer++;
	    				tshirts[j] = -1;
	    				break;
	    			}
    			}
    			
    		}
    	}
    	
        return answer;
    }
}
