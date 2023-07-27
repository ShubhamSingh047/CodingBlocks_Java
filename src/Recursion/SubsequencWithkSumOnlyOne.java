package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsequencWithkSumOnlyOne {
	public static void main(String[] args) {
		int arr[]= {1,2,3};
		List<Integer> list=new ArrayList<Integer>();
		CallingRecursion(arr, 0, 0,list,6);
	}

	private static boolean CallingRecursion(int[] arr, int i, int sum, List<Integer> list, int k) {
		// TODO Auto-generated method stub
		if(i==arr.length) {
			if(sum==k) {
				System.out.println(list+" ");
				return true;
			}
			return false;
		}
		
		list.add(arr[i]);
		sum+=arr[i];
		if(CallingRecursion(arr,i+1,sum,list,k)) {
			return true;
		}
		list.remove(list.size()-1);
		sum-=arr[i];
		if(CallingRecursion(arr, i+1, sum, list, k)) {
			return true;
		}
		return false;
	}
}
