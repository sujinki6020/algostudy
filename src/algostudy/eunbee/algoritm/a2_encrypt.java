package algostudy.eunbee.algoritm;

public class a2_encrypt {
	public static long encrypt(int[] numbers) {
		long max = 0;
		long sum =1;
		
		for(int i=0; i< numbers.length; i++) {
			//배열중 하나의 값을 1 늘리기
			numbers[i] = numbers[i]+1;
			
			for(int j = 0; j< numbers.length; j++ ) {
				//값을 모두 곱하기
				sum *= numbers[j];
				
				if(max<sum) {
					max = sum;
				}
			}
			//값 초기화
			sum = 1;
			numbers[i] = numbers[i]-1;
		}
		return max;
	}
	public static void main(String[] args) {
		int[] numbers = {1000,999,998,997,996,995};
		System.out.println(encrypt(numbers));
	}

}
