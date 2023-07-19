package Recursion;

public class PowerLog {
	public static void main(String[] args) {
		int res=Printing(3,3);
		System.out.println(res);
	}
	public static int Printing(int x, int n) {
		if(n==0)return 1;
		int xn=Printing(x,n/2);
		xn*=xn;
		if(n%2!=0) {
			xn*=x;
		}
		return xn;
	}
}
