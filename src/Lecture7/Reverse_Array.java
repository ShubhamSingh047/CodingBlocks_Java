package Lecture7;

public class Reverse_Array {
	public static void main(String[] args) {
		int [] arr= {2,3,4,5,11,7,1};
		Reverse(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void Reverse(int[] arr) {
		// TODO Auto-generated constructor stub
		int n=arr.length;
		for(int i=0; i<n/2; i++) {
			swap(arr, i, n-i-1);
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;	
	}
	
}
