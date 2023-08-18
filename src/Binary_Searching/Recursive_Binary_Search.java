package Binary_Searching;

public class Recursive_Binary_Search {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		System.out.println(Recursive_Sol(arr,5,0,4));
	}

	private static int Recursive_Sol(int[] arr, int target, int low, int high) {
		// TODO Auto-generated method stub
		if(low>high) {
			return -1;
		}
		int mid=(low+high)/2;
		
		if(arr[mid]>target) {
			high=mid;
		}else if(arr[mid]<target) {
			low=mid+1;
		}else {
			return mid;
		}
		return Recursive_Sol(arr, target,low,high);
	}
}
