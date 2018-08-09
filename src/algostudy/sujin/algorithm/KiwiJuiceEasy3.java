package algostudy.sujin.algorithm;

public class KiwiJuiceEasy3 {
	
	public int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] toId) {
		for(int i=0; i<fromId.length; i++) {
			int sum = bottles[fromId[i]] + bottles[toId[i]];
			bottles[toId[i]] = Math.min(sum,  capacities[toId[i]]);
			bottles[fromId[i]] = sum - bottles[toId[i]];
		}
		return bottles;
	}
	
	public static void main(String[] args) {
		KiwiJuiceEasy3 kiwi3 = new KiwiJuiceEasy3();
		
		int[] capacities = {14, 35, 86, 58, 25, 62};
		int[] bottles = {6, 34, 27, 38, 9, 60};
		int[] fromId = {1, 2, 4, 5, 3, 3, 1, 0};
		int[] toId = {0, 1, 2, 4, 2, 5, 3, 1};
		
		int[] result =  kiwi3.thePouring(capacities, bottles, fromId, toId);
		
		for(int i = 0; i < result.length; i++){
			System.out.print(result[i]+" ");
		}
	}
}
