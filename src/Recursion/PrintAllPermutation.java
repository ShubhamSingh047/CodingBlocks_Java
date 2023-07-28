package Recursion;
import java.util.*;

public class PrintAllPermutation {
	public static void main(String[] args) {
		int[] arr= {1,2,3};
		boolean[] flag=new boolean[arr.length];
		List<Integer> li=new ArrayList<>();
		PrintPermutaion(arr,flag,li);
	}

	public static void PrintPermutaion(int[] arr, boolean[] flag, List<Integer>li) {
		// TODO Auto-generated method stub
		if(li.size()==arr.length) {
			System.out.println(li);
			return;
		}
		for(int i=0; i<arr.length; i++) {
			if(!flag[i]) {
				flag[i]=true;
				li.add(arr[i]);
				PrintPermutaion(arr,flag,li);
				li.remove(li.size()-1);
				flag[i]=false;
			}
		}
	}
}
