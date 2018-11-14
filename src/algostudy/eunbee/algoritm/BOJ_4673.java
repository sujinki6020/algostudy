package algostudy.eunbee.algoritm;

public class BOJ_4673 {
	public static void main(String[] args) {
		int[] arr = new int[9999];
		for(int i = 0; i < 9999; i++) {
			//배열에 숫자들 넣기
			arr[i] = i+1;
		}
		for(int i = 1; i < 10000; i++) {
			//i가 몇자리수인지 알아내기
			int length= i/10+1;
			int result = i;
			int rest = i;
			for(int j=length; j>0; j--) {
				result += rest / (Math.pow(10, j-1));
				rest = (int) (rest % (Math.pow(10, j-1)));
			}
			
			//결과값과 일치하는 값이 있는지 확인
			for(int k=0; k< 9999; k++) {
				//배열의 수와 결과값이 일치하면 해당 값을 0으로 바꾸기
				if(arr[k] == result) {
					arr[k] = 0;
				}
			}
		}
		for(int i = 0; i<9999; i++) {
			if(arr[i] !=0) {
				System.out.println(arr[i]);
			}
		}
	}
}
