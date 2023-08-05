package Searching;

public class FirstOccurance {
	public static void main(String[] args) {
		int arr[]= {1,10,10,10,20,20,40};
		int x=20;
		int ans=-1;
//		Iterative(arr, x, ans);
		Recursive(arr,x,ans,0,arr.length-1);
		
	}
	private static void Recursive(int[] arr, int x, int ans, int low, int high) {
		// TODO Auto-generated method stub
		if(low>high) {
			System.out.println(ans);
			return;
		}
		
		int mid=low+(high-low)/2;
		
		if(arr[mid]>=x) {
			ans=mid;
			high=mid-1;
		}else {
			low=mid+1;
		}
		Recursive(arr, x, ans, low, high);
		
	}
	public static void Iterative(int[] arr,int x,int ans){
		int low=0; int high=arr.length-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]>=x) {
				ans=mid;
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		System.out.println(ans);
	}
}
