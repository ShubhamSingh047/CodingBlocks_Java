package Recursion;

public class SumOfDigit {
	public static void main(String[] args) {
		int res= Sum(9987);
		System.out.println(res);
	}
	public static int Sum(int n) {
		if(n==0)return 0;
		return Sum(n/10)+n%10;
	}
}
