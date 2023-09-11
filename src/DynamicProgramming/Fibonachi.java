package DynamicProgramming;
import java.util.*;

public class Fibonachi {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int res=FibMemoization(n,new int[n+1]);
		System.out.println(res);
	}
	public static int FibMemoization(int n, int[] arr) {
		if(n<=1)return n;
		
		if(arr[n]!=0)return arr[n];
		int first=FibMemoization(n-1, arr);
		int second=FibMemoization(n-2, arr);
		int res=first+second;
		
		arr[n]=res;
		return res;
	}
}
