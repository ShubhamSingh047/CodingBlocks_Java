package Lecture8;


public class BubbleSort {
	public static void main(String[] args) {
		int[] arr= {5,4,3,2,1};
		for(int i=1; i<arr.length ; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					Swap(arr, j, j+1);
				}
			}
		}
		PrinArr(arr);
	}
	public static void Swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void PrinArr(int[] arr) {
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
