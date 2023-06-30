package Lecture7;

public class Rotate_Array_k {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		int k=3;
		Rotate(arr,k);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	public static void Rotate(int[] arr, int k) {
		k=k%arr.length;
		for(int i=0; i<k; i++) {
			int res=arr[arr.length-1];
			for(int j=arr.length-2; j>=0; j--) {
				arr[j+1]=arr[j];
			}
			arr[0]=res;
		}
	}
}
