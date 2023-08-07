package Searching;

public class Count_1_Sorted {
	public static void main(String[] args) {
		int arr[]= {1,1,1,1,1,1,1};
		int low=0; int high=arr.length-1;
		int ans=0;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]>=1) {
				ans=mid;
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		System.out.println(arr.length-ans);
	}
}
