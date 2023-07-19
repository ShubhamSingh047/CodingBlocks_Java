package Recursion;

public class RopeCuttingProblem {
	public static void main(String[] args) {
		int res=Rope_Function(9, 2, 2, 2);
		System.out.println(res);
	}

	public static int Rope_Function(int n, int a, int b, int c) {
		if (n == 0)
			return 0;
		if (n < 0)
			return -1;
		int res=Math.max(Rope_Function(n - a, a, b, c), 
				Math.max(Rope_Function(n - b, a, b, c), 
						Rope_Function(n - c, a, b, c)));
		if(res<0) {
			return -1;
		}
		return res+1;
	}
}
