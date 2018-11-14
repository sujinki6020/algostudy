package algostudy.eunbee.algoritm;

import java.util.HashMap;

public class a1_interestionParty {
	public static int bestInvitation(String[] first, String[] second) {
//		int count = 0;
//		for(int i =0; i< first.length -1 ; i++) {
//			for(int j = i+1; j<=1; j--) {
//			if(first[i].equals(first[j])) {
//				count++;
//				}
//			}
//		}
//		return count+1;
		
		/*방법1)*/
		int i, j;
		int ans =0;
		for(i = 0; i< first.length; i++) {
			int f = 0;
			int s = 0;
			for(j = 0; j< first.length; j++) {
				if(first[i].equals(first[j])) f++;
				if(first[i].equals(second[j])) f++;
				if(second[i].equals(first[j])) s++;
				if(second[i].equals(second[j])) s++;
			}
			ans = Math.max(f, ans);
			ans = Math.max(s, ans);
		}
		return ans;
		
		
//		HashMap<String, Integer> dic = new HashMap<String, Integer>();
//		for(int i = 0; i < first.length; i++) {
//			dic.put(first[i], 0);
//		}
		
	}
	public static void main(String[] args) {
		String[] firstArr = {"a", "b", "c", "b","f"};
		String[] secondArr = {"c", "c", "a", "a", "a"};
		int result = bestInvitation(firstArr, secondArr);
		System.out.println("공통주제 : " + result);
	}
}
