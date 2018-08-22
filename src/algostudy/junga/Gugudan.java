package algostudy.junga;

import java.util.Scanner;

// N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
public class Gugudan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		// 만약에 N이 7;
		if(1<=N && N<=9) {
			for(int i=1; i<=9; i++) {
			/*	System.out.printf("%d*%d=%d\n",N,i,N*i);*/
				 System.out.println(N+" * "+i+" = "+N*i);
			}			
		}
	}
}
