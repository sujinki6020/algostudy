package algostudy.junga.Recursion;

// 1 - n 까지의 합
/*
 *  int result = func(4); 
 *   10  return 4 + func(3);
 *    6   return 3 + func(2);
 *    3    return2 + func(1);
 *    1      return1 + func(0);
 *            return 0;
 */
public class Code02 {
	public static void main(String[] args) {
		int result = func(4);
		System.out.println(result);
	}
	public static int func(int n) {
		if (n==0)
			return 0;
		else {
			return n+func(n-1);
		}
	}
}
