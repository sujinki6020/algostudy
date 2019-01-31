package algostudy.eunbee.algoritm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_2204 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String preWord = null;
		while (true) {
			int num = Integer.parseInt(sc.nextLine());
			
			System.out.println(num);
			if (num == 0) {
				break;
			}
			if (preWord == null) {
				preWord = sc.nextLine();
			}
			String nextWord = null;

			int result = 0;

			for (int i = 1; i < num; i++) {
				nextWord = sc.nextLine();

				result = compareWord(preWord.toLowerCase(), nextWord.toLowerCase());

				CompareResult cResult = new CompareResult();
				cResult.init(result);

				if (cResult.changePreWord()) {
					if (cResult.resultCase().equals("nextWord가 preWrod보다 작음")) {
						preWord = nextWord;
					} else {
						if (cResult.resultCase().equals("자리수 확인 후 preWord 재정비")) {
							preWord = preWord.length() < nextWord.length() ? preWord : nextWord;
						}
					}
				}
			}
			System.out.println(preWord);
			preWord = null;
		}
	}

	public static int compareWord(String preWord, String nextWord) {
		int length = preWord.length() < nextWord.length() ? preWord.length() : nextWord.length();
		int result = 0;
		int equal = 0;
		for (int i = 0; i < length; i++) {
			int pre = preWord.charAt(i);
			int next = nextWord.charAt(i);

			if (next > pre) {
				break;
			} else if (next < pre) {
				result = 1;
				break;
			} else {
				if (next == pre) {
					equal++;
				}
			}

			if (equal == length) {
				result = 2;
			}
		}
		return result;
	}

	static class CompareResult {
		private int result = 0;

		private void init(int result) {
			this.result = result;
		}

		public boolean changePreWord() {
			if (result == 0) {
				return false;
			}
			return true;
		}

		public String resultCase() {
			String rCase = null;
			if (result == 1)
				return "nextWord가 preWrod보다 작음";
			if (result == 2)
				return "자리수 확인 후 preWord 재정비";
			return rCase;
		}

	}
}
