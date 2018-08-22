package algostudy.junga.Recursion;

// xⁿ = x * xⁿ-¹

public class Test04 {
	
	public static double power(double x, int n) {
		if (n == 0)
			return 1;
		else
			return x * power(x, n-1);
	}
}
