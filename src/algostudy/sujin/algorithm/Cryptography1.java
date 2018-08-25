package algostudy.sujin.algorithm;

public class Cryptography1 {
	public long encrypt(int[] numbers) {
		long ans = 0;
		for(int i=0; i<numbers.length; i++) {
			long temp=1;
			for(int j=0; j<numbers.length; j++) {
				if(i==j) {
					temp *= (numbers[j] +1);
				} else {
					temp *= numbers[j];
				}
			}
			ans = Math.max(ans, temp);
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Cryptography1 cp1 = new Cryptography1();
		int[] numbers = {1,2,3};
		System.out.println(cp1.encrypt(numbers));
	}
}
