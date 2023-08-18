package Binary_Searching;

public class Minimum_In_Sorted {
	public static void main(String[] args) {
		int[] arr= {7,8,9,10,0,1,1,2,3};
		int low=0, high=arr.length-1;
		int ans=1000;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[low]<=arr[high]) {
				System.out.println(arr[low]);
				return;
			}
			else if(arr[mid]<=high) {
				ans=Math.min(arr[mid],ans);
				high=mid-1;
			}else {
				ans=Math.min(arr[mid],ans);
				low=mid+1;
			}
		}
	}
}
