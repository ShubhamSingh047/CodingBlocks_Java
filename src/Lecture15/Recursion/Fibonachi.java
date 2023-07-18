package Lecture15.Recursion;

public class Fibonachi {
	public static void main(String[] args) {
		int n=5;
		int res=Finonachi(n);
		System.out.println(res);
	}
	public static int Finonachi(int n) {
		if (n==0||n==1){
			return n; 
		}
		return Finonachi(n-1)+Finonachi(n-2);
	}
}
