package algostudy.junga.Recursion;

/* 
* 피보나치는 수열 종류 중 하나이다. 1 1 2 3 5 8 13 21... 
* 앞에 있는 숫자와 그 앞에 있는 숫자와 더한 것을 나열하는 것.
* ex) 1 + 1 = 2
*     2 + 3 = 5 
*     3 + 5 = 8
*     5 + 8 = 13
*     
*/
// 예제  - 피보나치 수열을 입력받은 숫자 개수만큼 출력하라 

public class Fibonacci {
	static int sum;
	public static void main(String[] args) {
		int n = 8;
		for(int i=1; i<=n; i++) {
			System.out.println(fibo(i));
		}
	}
	public static int fibo(int n) {
	   if(n <=1 ) {
		   return n;
	   }else 
		   return fibo(n-2)+fibo(n-1);
	}
}
