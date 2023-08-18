package Binary_Searching;

public class BS_Reverse_Sorted {
	public static void main(String[] args) {
		int[] arr= {20,17,15,13,12,10,9,8,4};
		int low=0, high=arr.length-1;
		int target=8;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==target) {
				System.out.println(mid);
				return;
			}
			else if(arr[mid]<target) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		System.out.println(-1);
	}
}
