package Self;

import java.util.Scanner;

public class RotateArraykAntiClockWise {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int k=s.nextInt();
		int arr[]= {1,2,3,4,5};
		int n=arr.length;
		Reverse(arr, 0, n-k-1);
		Reverse(arr, n-k, n-1);
		Reverse(arr, 0, n-1);
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
	}
	public static void Reverse(int arr[], int i, int n) {
		while(i<=n) {
			int temp=arr[i];
			arr[i]=arr[n];
			arr[n]=temp;
			i++;
			n--;
		}
	}
}
