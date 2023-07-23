package Recursion;

import java.util.ArrayList;

public class SubSequence {
	public static void main(String[] args) {
		int arr[]= {3,2,1};
		ArrayList<Integer> li=new ArrayList<Integer>();
		PrintSubsequence(0,arr,li);
	}

	private static void PrintSubsequence(int i, int[] arr,ArrayList<Integer>temp) {
		if(i>=arr.length) {
			System.out.println(temp);
			return;
		}
		
		temp.add(arr[i]);
		PrintSubsequence(i+1,arr, temp);
		temp.remove(temp.size()-1);
		PrintSubsequence(i+1,arr, temp);
	}
}
