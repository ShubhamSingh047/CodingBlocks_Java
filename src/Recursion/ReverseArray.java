package Recursion;

public class ReverseArray {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		Reverse(arr,0,5);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

	private static void Reverse(int[] arr, int i,int n) {
		// TODO Auto-generated method stub
		if(i>=n/2) {
			return;
		}
		Swap(arr,i,n-i-1);
		Reverse(arr, i+1, n);
	}

	private static void Swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
}
