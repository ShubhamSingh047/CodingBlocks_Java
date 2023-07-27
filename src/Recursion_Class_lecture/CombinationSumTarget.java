package Recursion_Class_lecture;

import java.util.*;

public class CombinationSumTarget {
	public static void main(String[] args) {
		int[] arr= {2,1,3};
		int target=6;
		List<Integer> li=new ArrayList<>();
		List<List<Integer>> ans=new ArrayList<>();
		Combinations(arr,0,target,li,ans);
		System.out.println(ans);
	}

	public static void Combinations(int[] arr, int i, int target, List<Integer> li, List<List<Integer>> ans) {
		// TODO Auto-generated method stub
		if(i==arr.length||target==0) {
			if(target==0) {
				ans.add(new ArrayList<>(li));
			}
			return;
		}
		
		if(arr[i]<=target) {
			li.add(arr[i]);
			Combinations(arr,i,target-arr[i],li,ans);
			li.remove(li.size()-1);
		}
		Combinations(arr,i+1,target,li,ans);
	}
	

}
