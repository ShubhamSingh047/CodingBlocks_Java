package Searching;

public class LastOccurance {
	public static void main(String[] args) {
		int arr[]= {10,15,20,20,20,40,40};
		int x=20;
//		Iterative(arr,x,0,arr.length-1,-1);
		Recursive(arr,x,0,arr.length-1,-1);
	}

	private static void Recursive(int[] arr, int x, int low, int high, int ans) {
		// TODO Auto-generated method stub
		if(low>high) {
			System.out.println(ans);
			return;
		}
		int mid=(low+high)/2;
		if(arr[mid]<=x) {
			ans=mid;
			low=mid+1;
		}else {
			high=mid-1;
		}
		Recursive(arr, x, low, high, ans);
	}

	private static void Iterative(int[] arr, int x, int low, int high, int ans) {
		// TODO Auto-generated method stub
		while(low<=high) {
		int mid=low+(high-low)/2;
		if(arr[mid]<=x) {
			ans=mid;
			low=mid+1;
		}else {
			high=mid-1;
		}
		}
		System.out.println(ans);
	}
}
