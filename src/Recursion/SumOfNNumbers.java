package Recursion;
import java.util.*;

public class SumOfNNumbers {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int ans=0;
		System.out.println(Sum(n,ans));
		int res=SumFunc(n);
		System.out.println(res);
	}
	
// this is parmertised way
	public static int Sum(int n,int ans) {
		if(n==0) {
			return ans;
		}
		return Sum(n-1,ans+n);
	}
	
	
//	this is function way
	public static int SumFunc(int n) {
		if(n==0)return 0;
		return (n+SumFunc(n-1));
	}
}
