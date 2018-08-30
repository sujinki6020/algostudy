package algostudy.junga.baekjoon;

/*
 * 1. 먼저 boolean 배열이 필요함. 자바의 경우 boolean 배열은 모든 요소가 false로 초기화 되어 있음.
 * 2. d(n)의 결과는 저래 n보다 큰 수가 나온다, 동시에 셀프넘버가 결과값으로 나오지 않는다. 즉 d(i)의 return 값은 무조건 생성자를 가지는 수라는 뜻이 된다.
 * 3. 그래서 boolean 배열의 인덱스를 d(n)의 return값으ㅗ 지정하여 해당 배열의 요소를 true로 변경하면, 인덱스가 생성자 가지면 true 아니면 false임 
 * 4. true가 아닌걸 출력하면 == 셀프넘버임.
 * 
 * */

public class Baek4673 {
	public static void main(String[] args) {
		boolean[] isNotSelfNum = new boolean[10001];
		
		for(int i=1; i<=10000; i++) {
			int dn = d(i);
			if(dn <= 10000) {
				isNotSelfNum[dn] = true;
			}
		}
		for(int i=1; i< isNotSelfNum.length; i++) {
			if(!isNotSelfNum[i]) {
				System.out.println(i);
			}
		}
	
	}
	public static int d(int n) {
		int dn = n;
		while(n > 0) {
			dn += n%10;
			n/=10;
		}
		return dn;
	}

}
