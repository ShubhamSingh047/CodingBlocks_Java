package Binary_Searching;

public class Recursive_BS {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		
		int res=Recursive(arr,0,arr.length-1,1);
		System.out.println(res);
	}

	public static int Recursive(int[] arr, int low, int high, int x) {
		// TODO Auto-generated method stub
		if(low>high) {
			return -1;
		}
		
		int mid=low+(high-low)/2;
		
		if(x==arr[mid]) return mid;
		
		if(x<arr[mid])high=mid-1;
		
		else low=mid+1;
		
		
		return Recursive(arr, low, high, x);
	}
}
