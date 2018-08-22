package algostudy.junga.Recursion;

/*
 *    fatorial(4)   
 *  24  return 4 = fatorial(3)
 *   6   return 3 = fatorial(2)
 *   2     return 2 = fatorial(1)
 *   1      return 1 = fatorial(0)
 *                  1
 *                  
 *  3! = 3*2*1 = 6
    4! = 4*3*2*1 = 24
    5! = 5*4*3*2*1 = 120


 */
public class Factorial {
	public static int fatorial(int n) {		
		if(n==0)
		  return 1;
		else
		  return n * fatorial(n-1);
		
	}
}
