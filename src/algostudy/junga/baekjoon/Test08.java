package algostudy.junga.baekjoon;

import java.util.Scanner;

// 시험 점수를 90-100점 A, 80-89점은 B , 70-79점은 C, 60-69점은 D 나머지는 F
public class Test08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		if(0< total && 90 <= total && total <= 100) {
			System.out.println("A");
		}else if(0< total && 80 <= total && total <= 89 ) {
			System.out.println("B");
		}else if(0< total && 70 <= total && total <= 79) System.out.println("C");
		else if(0< total && 60 <= total && total <= 69) System.out.println("D");
		else {
			System.out.println("F");
		}
	}
}
