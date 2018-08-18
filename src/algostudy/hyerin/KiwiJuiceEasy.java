package algostudy.hyerin;

public class KiwiJuiceEasy {
	public int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] toId) {
		for (int i = 0; i < fromId.length; i++) {
			int f = fromId[i];
			int t = toId[i];
			int space = capacities[t] - bottles[t]; // 공간 = 용랑 - 주스양
			
			if (space >= bottles[f]) { // 공간이 주스보다 크다면
				int vol = bottles[f]; // vol은 주스양
				bottles[t] += vol; // 목적지 병의 주스양 += 출발지의 주스양
				bottles[f] = 0; // 출발지의 주스양 = 0
			} else { // 공간이 더 작다면
				int vol = space; // 옮길 수 있는 양은 공간만큼
				bottles[t] += vol; // 목적지의 주스양 += 공간크기
				bottles[f] -= vol; // 출발지의 주스양 -= 목적지의 병의 남은 공간크기
			}
		}
		return bottles;
	}
}
