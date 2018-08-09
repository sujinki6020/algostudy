package algostudy.junga;

public class KiwiJuiceEasy2 {
	public int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] toId) {
		for(int i=0; i< fromId.length; i++) {
			int f= fromId[i];
			int t = toId[i];
			
			int vol = Math.min(bottles[f], capacities[t] - bottles[t]);
			
			bottles[f] -= vol;
			bottles[t] += vol;
		}
		
		return bottles;
	}

}
