package Searching;

public class UniqueElment {
	public static void main(String[] args) {
		int[] arr= {1,2,2,3,3,4,4,5,5};
		int low=1, high=arr.length-2;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid-1]==arr[mid]||arr[mid+1]==arr[mid]) {
				int left=mid-low-1;
				if(left%2==0) {
					low=mid+1;
				}else {
					high=mid-1;
				}
			}else {
				System.out.println(arr[mid]);
				return;
			}
		}
		System.out.println(-1);
	}
}
