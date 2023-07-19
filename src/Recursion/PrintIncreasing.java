package Recursion;

public class PrintIncreasing {
	public static void main(String[] args) {
		Printing(5);
	}
	public static void Printing(int n) {
		if(n==0)
			return;
		Printing(n-1);
		System.out.println(n);
	}
}
