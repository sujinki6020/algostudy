package algostudy.sujin.algorithm;

import java.util.Scanner;

public class BOJ2966 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		String ans = sc.nextLine();
		int[] score = new int[3];
		
		String Adrian = "ABC";
		String Bruno = "BABC";
		String Goran = "CCAABB";
		
		for(int i=0; i<N; i++) {
			if(Adrian.charAt(i%3)==ans.charAt(i)) {
				score[0]++;
			}
			if(Bruno.charAt(i%4)==ans.charAt(i)) {
				score[1]++;
			}
			if(Goran.charAt(i%6)==ans.charAt(i)) {
				score[2]++;
			}
		}
		
		if(score[0]>score[1] && score[0]>score[2]) {
			System.out.printf("%d\n%s\n",score[0],"Adrian");
		} else if(score[1]>score[2] && score[1]>score[0]) {
			System.out.printf("%d\n%s\n",score[1],"Bruno");
		} else if(score[2]>score[1] && score[2]>score[0]) {
			System.out.printf("%d\n%s\n",score[2],"Goran");
		} else if(score[0]==score[1] && score[0]>score[2]) {
			System.out.println(score[0]);
			System.out.println("Adrian");
			System.out.println("Bruno");
		} else if(score[0]==score[1] && score[0]<score[2]) {
			System.out.printf("%d\n%s\n",score[2],"Goran");
		} else if(score[1]==score[2] && score[1]>score[0]) {
			System.out.println(score[1]);
			System.out.println("Bruno");
			System.out.println("Goran");
		} else if(score[1]==score[2] && score[1]<score[0]) {
			System.out.printf("%d\n%s\n",score[0],"Adrian");
		} else if(score[0]==score[2] && score[0]>score[1]) {
			System.out.println(score[0]);
			System.out.println("Adrian");
			System.out.println("Goran");
		} else if(score[0]==score[2] && score[0]<score[1]) {
			System.out.printf("%d\n%s\n",score[1],"Bruno");
		} else if(score[0]==score[1] && score[1]==score[2] && score[0]==score[2]) {
			System.out.println(score[0]);
			System.out.println("Adrian");
			System.out.println("Bruno");
			System.out.println("Goran");
		}
	}
}
