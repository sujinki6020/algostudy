package algostudy.hyerin;

public class InterestingParty {
	public static void main(String[] args) {
		String[] first = {"java", "python", "snakes", "python"};
		String[] second = {"python", "cobra", "java", "programming"};
		System.out.println(bestInvitation(first, second));
	}
	
	public static int bestInvitation(String[] first, String[] second) {
		int ans = 0;
		for(int i = 0; i < first.length; i++) {
			int f = 0;
			int s = 0;
			for(int j = 0; j < second.length; j++) {
				if(first[i].equals(first[j])) f++;
				if(first[i].equals(second[j])) f++;
				if(second[i].equals(first[j])) s++;
				if(second[i].equals(second[j])) s++;
			}
			ans = Math.max(f, ans);
			ans = Math.max(s, ans);
		}
		return ans;
	}
	
//	public static int bestInvitation(String[] first, String[] second) {
//		int invitation = 1;
//		for(int i = 0; i < first.length; i++) {
//			String firstInter = first[i];
//			for(int j = 0; j < second.length; j++) {
//				String secondInter = second[j];
//				if(firstInter.equals(secondInter)) {
//					invitation += 1;
//				}
//			}
//		}
//		return invitation;
//	}
}
