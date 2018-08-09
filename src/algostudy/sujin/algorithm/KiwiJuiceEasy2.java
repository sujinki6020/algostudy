package algostudy.sujin.algorithm;

// Math.min
public class KiwiJuiceEasy2 {
	public int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] toId) {
		for(int i=0; i<fromId.length; i++) {
			int f = fromId[i];
			int t = toId[i];
			
			int vol = Math.min(bottles[f], capacities[t]-bottles[t]);
			
			bottles[f] -= vol;
			bottles[t] += vol;
		}
		return bottles;
	}
	
	public static void main(String[] args) {
		KiwiJuiceEasy2 kiwi2 = new KiwiJuiceEasy2();
		int[] capacities = {14, 35, 86, 58, 25, 62};
		int[] bottles = {6, 34, 27, 38, 9, 60};
		int[] fromId = {1, 2, 4, 5, 3, 3, 1, 0};
		int[] toId = {0, 1, 2, 4, 2, 5, 3, 1};
//		int[] capacities = {30,20,10};
//		int[] bottles = {10,5,5};
//		int[] fromId = {0,1,2};
//		int[] toId = {1,2,0};
		
		int[] result =  kiwi2.thePouring(capacities, bottles, fromId, toId);
		
		for(int i = 0; i < result.length; i++){
			System.out.print(result[i]+" ");
		}
	}
}
