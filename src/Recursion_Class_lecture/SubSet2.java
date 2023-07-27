package Recursion_Class_lecture;

import java.util.*;

//we are suppose to print only non dublicate Array!
public class SubSet2 {
	public static void main(String[] args) {
		List<Integer> li=new ArrayList<>();
		int[] arr= {1,2,2};
		Arrays.sort(arr);
		PrintSubSet2(0,arr,li);
	}

	public static void PrintSubSet2(int i, int[] arr, List<Integer> li) {
		// TODO Auto-generated method stub
		if(i==arr.length) {
			System.out.println(li);
			return;
		}
		
		li.add(arr[i]);
		PrintSubSet2(i+1,arr,li);
		
		while(i+1<arr.length && arr[i]==arr[i+1]){
			i++;
		}
		
		li.remove(li.size()-1);
		PrintSubSet2(i+1,arr,li);
	}
}
