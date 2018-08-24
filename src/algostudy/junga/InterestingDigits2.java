package algostudy.junga;

import java.util.Vector;

public class InterestingDigits2 {
	
	public static int[] digits(int base){
		Vector<Integer> v = new Vector<>();
		for(int i=2; i<base; i++) {
			if((base-1)%i==0)v.add(i);
		}
		
		int[] ans = new int[v.size()];
		for(int j=0; j<v.size(); j++) ans[j] = v.get(j);
		
		return ans;
		
	}
}
