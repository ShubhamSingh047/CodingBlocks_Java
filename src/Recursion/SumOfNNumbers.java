package Recursion;
import java.util.*;

public class SumOfNNumbers {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int ans=0;
		System.out.print(Sum(n,ans));
	}
	public static int Sum(int n,int ans) {
		if(n==0) {
			return ans;
		}
		return Sum(n-1,ans+n);
	}
}
