package Sorting;

import java.util.*;

public class BubbleSort {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

//		for (int i = 0; i < n - 1; i++) {
//			if (arr[i] > arr[i + 1]) {
//				int temp = arr[i];
//				arr[i] = arr[i + 1];
//				arr[i + 1] = temp;
//				i = -1;
//			}
//		}
		int count=0;
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-i-1; j++) {
				count++;
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}

		for (int i : arr) {
			System.out.print(i + " ");
		}

	}
}
