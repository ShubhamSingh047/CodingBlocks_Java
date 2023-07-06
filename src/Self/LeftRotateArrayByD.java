package Self;

import java.util.Scanner;

public class LeftRotateArrayByD {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		Scanner s=new Scanner(System.in);
		int n=arr.length;
		int d=s.nextInt();
		d=d%n;
		if(d<0) {
			d+=n;
		}
		
		Reverse(arr, d, n-1);
		Reverse(arr, 0, d-1);
		Reverse(arr, 0, n-1);
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
	}
	public static void Reverse(int[] arr, int low, int high) {
		while(low<=high) {
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
	}
}
