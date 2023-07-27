package Recursion_Class_lecture;

import java.util.*;

public class CombinationSumTarget_2 {
	public static void main(String[] args) {
		int arr[]= {2,1,3};
		List<Integer> li=new ArrayList<>();
		Combination2(0,arr,li,3);
	}

	public static void Combination2(int i, int[] arr, List<Integer> li,int target) {
		// TODO Auto-generated method stub
		if(i==arr.length||target==0) {
			if(target==0)
				System.out.println(li);
			return;
		}
		if(arr[i]<=target) {
		li.add(arr[i]);
		Combination2(i+1, arr, li,target-arr[i]);
		li.remove(li.size()-1);
		}
		Combination2(i+1, arr, li,target);
	}
}
