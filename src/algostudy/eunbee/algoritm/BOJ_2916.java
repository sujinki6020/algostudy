package algostudy.eunbee.algoritm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_2916 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();
		int output = sc.nextInt();

		if (input >= 1 && output <= 10) {

			List<Integer> inputList = new ArrayList<>();
			List<Integer> outputList = new ArrayList<>();

			for (int i = 0; i < input; i++) {
				int in = sc.nextInt();
				if (in < 360) {
					inputList.add(in);
				}
			}
			for (int i = 0; i < output; i++) {
				int out = sc.nextInt();
				if (out < 360) {
					outputList.add(out);
				}
			}

			if (inputList.size() == input  && outputList.size() == output ) {

				int min = getMin(inputList);
				int GCB = getGCB(inputList, min);
				
				for (int i = 0; i < outputList.size(); i++) {
					if (outputList.get(i) % GCB == 0) {
						System.out.println("YES");
					} else {
						System.out.println("NO");
					}
				}

			}
		}
		
	}
	public static int getMin(List<Integer> inputList) {
		int min = 0;
		// Input 값 중에 작은 값 찾기
		for (int i = 0; i < inputList.size(); i++) {
			if (i == 0) {
				min = inputList.get(i);
			} else if (min > inputList.get(i)) {
				min = inputList.get(i);
			}
		}
		return min;
	}
	public static int getGCB(List<Integer> inputList, int min) {
		int GCB = 1;
		// 최대공약수 구하기(주어진 각이 여러개인지 하나인지에 따라)
		if (inputList.size() == 1) {
			int angle = inputList.get(0);
			int restAngle = 0;
			if (angle == 180) {
				GCB = 180;
			} else if (angle < 180) {
				restAngle = 180 - inputList.get(0);
			} else {
				int newAngle = 360 - angle;
				angle = newAngle;
				restAngle = 180 - newAngle;
			}
			// 여각과 각 중에 최소값 찾기
			min = angle > restAngle ? restAngle : angle;

			if (GCB != 180) {
				for (int i = min; i > 0; i--) {
					if (angle % i == 0 && restAngle % i == 0) {
						GCB = i;
						break;
					}
				}
			}

		} else {

			for (int i = min; i > 0; i--) {
				int check = 0;
				for (int j = 0; j < inputList.size(); j++) {
					// 공약수로 나누어지면 체크값 표시
					if (inputList.get(j) % i == 0)
						check++;
				}
				// 조건이 맞는 경우 최대공약수
				if (check == inputList.size()) {
					GCB = i;
					break;
				}
			}
		}

		
		return GCB;
	}
}
