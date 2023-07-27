package Recursion_Class_lecture;

import java.util.ArrayList;
import java.util.List;

public class SumOfSubset {
	public static void main(String[] args) {
		List<Integer> li=new ArrayList<>();
		int[] arr= {3,2,1};
		int sum=0;
		PrintSum(0,arr,sum,li);
		System.out.println(li);
	}

	public static void PrintSum(int i, int[] arr, int sum, List<Integer> li) {
		// TODO Auto-generated method stub
		if(i==arr.length) {
			li.add(sum);
			return;
		}
		PrintSum(i+1,arr,sum+arr[i],li);
		PrintSum(i+1,arr,sum,li);
	}

}
