package algostudy.junga;

import java.util.HashMap;

public class InterestingPartyTest2 {
	
	public int bestInvitation(String[] first, String[] secound) {
		HashMap<String,Integer> dic = new HashMap<String,Integer>();
		
		for( int i = 0; i <first.length; i++) {
			dic.put(first[i], 0);
			dic.put(secound[i],0);
		}
		
		for( int i = 0; i<first.length; i++) {
			dic.put(first[i], dic.get(first[i]+1));
			dic.put(secound[i],dic.get(secound[i]+1));
		}
		
		int ans = 0;
		for( String key:dic.keySet()) {
			ans = Math.max(ans, dic.get(key));
		}
		return ans;
	}

}
