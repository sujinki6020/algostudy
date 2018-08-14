package algostudy.junga;

public class InterestingPartyTest1 {
	public int bestInvitation(String[] first, String[] secound) {
		int i, j;
		int ans = 0;
		
		for(i = 0; i<first.length; i++) {
			int f = 0;
			int s = 0;
			for(j = 0; j <first.length; i++) {
				if(first[i].equals(first[j])) f++;
				if(first[i].equals(secound[j])) f++;
				if(secound[i].equals(first[j])) s++;
				if(secound[i].equals(secound[j])) s++;
			}
			ans = Math.max(f, ans);
			ans = Math.max(s, ans);
		}
		return ans;
	}

}
