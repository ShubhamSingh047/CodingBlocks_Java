package Searching;

public class Rotated_Times {
	public static void main(String[] args) {
		int arr[]= {4,5,1,2,3,3};
		int low=0, high=arr.length-1;
		int ans=100;
		int idx=-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[low]<=arr[high]) {
				if(arr[low]<ans) {
					idx=low;
					ans=arr[low];
				}
				System.out.println(idx);
				return;
			}else if(arr[mid]<=arr[high]) {
				if(arr[mid]<ans) {
					ans=arr[mid];
					idx=mid;
				}
				high=mid-1;
			}else {
				if(arr[low]<ans) {
					ans=arr[low];
					idx=low;
				}
				low=mid+1;
			}
		}
		System.out.println(idx);
	}
}
