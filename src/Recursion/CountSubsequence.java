package Recursion;
import java.util.*;

public class CountSubsequence {
	public static void main(String[] args) {
		int[] arr= {1,2,3};
		List<Integer> list=new ArrayList<Integer>();
		int res=Count(arr, 0);
		System.out.println(res);
	}
	public static int Count(int[] arr, int i) {
		if(i==arr.length) {
			return 1;
		}
		
		
		int n1=Count(arr, i+1);
		int n2=Count(arr,i+1);
		
		return n1+n2;
		
	}

}
