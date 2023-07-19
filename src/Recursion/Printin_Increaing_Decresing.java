package Recursion;

public class Printin_Increaing_Decresing {
	public static void main(String[] args) {
		Printing(5);
	}
	public static void Printing(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		Printing(n-1);
		if(n!=1)
			System.out.println(n);
	}
}
