package algostudy.junga;

import java.util.ArrayList;

public class InterestingDigits {
	
	public static int[] digits(int base)
	{
		ArrayList<Integer> list = new ArrayList<>();
		
		// 배수 구하기
		for(int i=2; i<base; i++) {
			boolean flag = true;
			for(int k1=0; k1<base; k1++) {
				for(int k2=0; k2<base; k2++) {
					for(int k3=0; k3<base; k3++) {
						if((k1+k2*base+k3*base) % i == 0 && (k1+k2+k3 % i !=0)) {
							// 각 i의 배수 숫자로 각 숫자의 합이 i의 배수가 아니면 
							flag = false;
							// i를 제외한다.
							break;
						}
					}
					if(!flag) break;
				}
				if(!flag) break; 
			}
			if(flag)list.add(i);
		}
		int [] ans = new int[list.size()];
		for( int j = 0; j<list.size(); j++) {
			ans[j] = list.get(j);
		}
		return ans;
		
	}

}
