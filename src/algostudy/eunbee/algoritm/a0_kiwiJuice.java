package algostudy.eunbee.algoritm;


public class a0_kiwiJuice {
	//capacities : 병의 용량
	//bottles :  주스의 용량
	//주스를 뺄 병 : fromId
	//주스를 넣을 병 : toId
	
	 /** 방법 1)*/
	public int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] toId) {
		
		for(int i =0; i< fromId.length; i++) {
			
			 int f = fromId[i];
			 int t = toId[i];
			 
			 // 병의 빈공간 : 주스를 넣을 병의 용량에서 주스의 용량을 뺀 값
			 int space = capacities[t] - bottles[t];
			 
			 //병의 빈공간이 넉넉할때
			 if(space >=bottles[f]) {
				 int vol = bottles[f];
				 bottles[t] += vol;
				 bottles[f] = 0;
			 }
			 //병의 빈공간이 부족할때
			 else {
				 int vol = space;
				 bottles[t] += vol;
				 bottles[f] -= vol;
			 }
		}
		return bottles;
		
	}
	
	/** 방법2)*/
	
	
	
}




