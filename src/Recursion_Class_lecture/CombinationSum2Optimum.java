package Recursion_Class_lecture;

import java.util.*;

public class CombinationSum2Optimum {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 1, 2, 2 };
		int target = 4;
		List<Integer> li = new ArrayList<Integer>();
		List<List<Integer>> ans = new ArrayList<>();
		CombinationSum(0, arr, target, li, ans);
		System.out.println(ans);
	}

	public static void CombinationSum(int i, int[] arr, int target, List<Integer> li, List<List<Integer>> ans) {
		// TODO Auto-generated method stub
		if (i == arr.length || target == 0) {
			if (target == 0) {
				ans.add(new ArrayList<>(li));
			}
			return;
		}
		for (int idx = i; idx < arr.length; idx++) {
			if (idx > i && arr[idx] == arr[idx - 1])
				continue;
			if (arr[idx] > target)
				break;
			li.add(arr[idx]);
			CombinationSum(idx + 1, arr, target - arr[idx], li, ans);
			li.remove(li.size() - 1);
		}
	}
}
