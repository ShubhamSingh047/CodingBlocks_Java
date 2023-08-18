package Binary_Searching;

public class UniqueElment {
	public static void main(String[] args) {
		int[] arr= {1,2,2,3,3,4,4,5,5};
		if(arr[0]!=arr[1]) {
			System.out.println(arr[0]);
			return;
		}
		if(arr[arr.length-1]!=arr[arr.length-2]) {
			System.out.println(arr[arr.length-1]);
			return;
		}

		int low=1, high=arr.length-2;
		
		while(low<=high) {
			int mid=(low+high)/2;
			if((arr[mid]!=arr[mid-1])&& arr[mid]!=arr[mid+1]){
			System.out.println(arr[mid]);
			return;
			}
			if((mid%2==1 && arr[mid+1]==arr[mid])||(arr[mid+1]==arr[mid] && mid%2==0)) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		System.out.println(-1);
	}
}
