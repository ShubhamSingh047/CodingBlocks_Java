package Recursion;
import java.util.*;

public class SubSequenceWithKsum {
	public static void main(String[] args) {
		int[] arr= {3,2,1};
		List<Integer> list=new ArrayList<Integer>();
		CallingRecursion(arr, 0, 0,list,3);
	}

	private static void CallingRecursion(int[] arr, int i, int sum, List<Integer> list,int k) {
		// TODO Auto-generated method stub
		if(i==arr.length) {
			if(k==sum) {
				System.out.println(list);
			}
			return;
		}
		list.add(arr[i]);
		sum+=arr[i];
		CallingRecursion(arr,i+1, sum, list, k);
		list.remove(list.size()-1);
		sum-=arr[i];
		CallingRecursion(arr,i+1, sum, list, k);
	}
}
