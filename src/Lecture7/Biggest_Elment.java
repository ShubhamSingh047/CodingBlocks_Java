package Lecture7;

public class Biggest_Elment {
	public static void main(String[] args) {
		int arr[]= {1,34,56,78,11,-7,90};
		int res=Find_Max(arr,arr[0]);
		System.out.println(res);
	}
	public static int Find_Max(int arr[], int x) {
		int res=0;
		for(int i=1; i<arr.length; i++) {
			if(x<arr[i]) {
				res=arr[i];
			}
		}
		return res;
	}
}
