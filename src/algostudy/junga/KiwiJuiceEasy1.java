package algostudy.junga;

public class KiwiJuiceEasy1 {
	public int[] thePourting(int[] capacities, int[] bottles, int[] fromId, int[] toId) {
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

}
