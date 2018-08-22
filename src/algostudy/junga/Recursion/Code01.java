package algostudy.junga.Recursion;
/*
 * 	순열에대한 예제 
 *  func(4)
 * 	println("Hello") func(3)
 *  println("Hello") func(2) 
 *  println("Hello") func(1)
 *  println("Hello") func(0)
 *  return;
 *  recursion 항상 무한루프에 빠지는 것은 아니다.
 *  
 * */


public class Code01 {
	public static void main(String[] args) {
		func(4);
	}
	
	public static void func(int n) {
		// Base case: 무한루프에 빠지지 안을 경우를 존재하게해야됨
		if(n<=0)
			return;
		// Recursive case: recursion을 반복하다보면 결국 base case로 수렴해야 한다.
		else {
			System.out.println("Hello");
			func(n-1);
		}
	}
}
