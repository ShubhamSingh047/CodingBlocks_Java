package Binary_Searching;

public class PeakElmentInArray {
	public static void main(String[] args) {
		int[] arr= {1,5,1,5,1};
		int low=1, high=3;
		if(arr[0]>arr[1]) {
			System.out.println(arr[0]);
			return;
		}
		if(arr[3]>arr[4]) {
			System.out.println(arr[3]);
			return;
		}
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]>arr[mid-1]&& arr[mid]>arr[mid+1]) {
				System.out.println(arr[mid]);
				return;
			}
			else if(arr[mid]>arr[mid+1]) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
	}
}
