package algostudy.sujin.algorithm;

import java.util.Arrays;

public class Cryptography2 {
	public long encrypt(int[] numbers) {
		long ans = 1;
		Arrays.sort(numbers);
		numbers[0]++;  // 최솟값 +1
		for(int i=0; i<numbers.length; i++) {
			ans *= numbers[i];
		}
		return ans;
	}
	public static void main(String[] args) {
		Cryptography2 cp2 = new Cryptography2();
		int[] numbers = {1,2,3};
		System.out.println(cp2.encrypt(numbers));
	}
}
