package Self;

import java.util.Iterator;
import java.util.Scanner;

public class RotateArrayByKClockwise {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		Scanner s= new Scanner(System.in);
		int d=s.nextInt();
		int n=arr.length;
		d%=n;
		Reverse(arr, d, n-d-1);
		Reverse(arr, n-d, n-1);
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
