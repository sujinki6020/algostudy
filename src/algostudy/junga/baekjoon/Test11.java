package algostudy.junga.baekjoon;

public class Test11 {
	public static void main(String[] args) {
		boolean[] selfNum = new boolean[10001];
		for(int i=1; i<=10000; i++) {
			int n = d(i); // 33 + 3 + 3 = d(33)  1 + 1 = d(1)
			if(n <=10000) {
				selfNum[n] = true;
			}
		}
		for(int i=1; i<selfNum.length; i++) {
			if(!selfNum[i]) {
				System.out.println(i);
			}
		}
	}
	
	public static int d(int n) {
		int sum = n;
		while(n > 0) {
			sum += n%10;
			n/=10;
		}
		return sum;
	}
}
