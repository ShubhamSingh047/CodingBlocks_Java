package Lecture8;

public class SelctionSort {
	public static void main(String[] args) {
		int[] arr= {5,4,1,2,3};
		for(int i=0; i<arr.length; i++) {
			int min=i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[min]>arr[j]) {
					min=j;
				};
			}
			BubbleSort.Swap(arr, i, min);
		}
		BubbleSort.PrinArr(arr);
	}

}
