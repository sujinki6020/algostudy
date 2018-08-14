package algostudy.jongmin.algorithm;

public class KiwiJuiceEasy1 {
	public int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] toId) {
		for(int i=0; i < fromId.length; i++) {
			int f = fromId[i]; 
			int t = toId[i];
			int space = capacities[t] - bottles[t];
			
			if(space >= bottles[f]) {
				int vol = bottles[f];
				bottles[t] += vol;
				bottles[f] = 0;
			}else {
				int vol = space;
				bottles[t] += vol;
				bottles[f] -= vol;
			}
		}
		return bottles;
	}
	
	public static void main (String[] args) {
		KiwiJuiceEasy1 kiwi1 = new KiwiJuiceEasy1();
		int[] capacities = {14, 35, 86, 58, 25, 62};
		int[] bottles = {6, 34, 27, 38, 9, 60};
		int[] fromId = {1, 2, 4, 5, 3, 3, 1, 0};
		int[] toId = {0, 1, 2, 4, 2, 5, 3, 1};
		int[] result =  kiwi1.thePouring(capacities, bottles, fromId, toId);
		
		for(int i = 0; i < result.length; i++){
			System.out.print(result[i]+" ");
		}
	}
}









